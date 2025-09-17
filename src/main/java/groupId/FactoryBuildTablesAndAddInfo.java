package groupId;

import groupId.keyIdClass.KeyLinkedPurchaseList;
import org.hibernate.Session;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FactoryBuildTablesAndAddInfo {
    private String fileRead(Path path) throws IOException {
        String textTables = Files.readString(path);
        return textTables;
    }

    private String[] getArrayStatements(Path path) throws IOException {
        String[] arrayStatements = fileRead(path).split(";");
        for (int i = 0; i < arrayStatements.length; i++) {
            arrayStatements[i] += ";";
        }
        return arrayStatements;
    }

    public void buildTables(Session session, Path path) throws IOException {
        String[] arrayTables = getArrayStatements(path);
        for (int i = 0; i < arrayTables.length; i++) {
            session.createNativeQuery(arrayTables[i]).executeUpdate();
        }
    }

    public void addInfoToTables(Path path, Session session) throws IOException {
        String info = fileRead(path);
        String[] sqlCommands = info.split(";");
        for (String command : sqlCommands) {
            command = command.trim();
            if (!command.isEmpty() && command.startsWith("INSERT INTO")) {
                String idValue = extractIdFromInsert(command);
                if (idValue != null) {
                    String insertCommand = command.replace("INSERT INTO", "INSERT IGNORE INTO");
                    session.createNativeQuery(insertCommand).executeUpdate();
                }
            } else {
                session.createNativeQuery(command).executeUpdate();
            }
        }
    }

    private String extractIdFromInsert(String command) {
        String[] parts = command.split("VALUES");
        if (parts.length > 1) {
            String valuesPart = parts[1].trim();
            String[] values = valuesPart.replace("(", "").replace(")", "").split(",");
            return values[0].trim();
        }
        return null;
    }

    public void addInfoToLinkedPurchaseList(Session session) {
        List<Subscription> list = session.createQuery("from Subscription", Subscription.class).getResultList();
        list.stream().map(a -> new KeyLinkedPurchaseList(a.getStudentId(), a.getCourseId())).forEach(key1 -> {
            LinkedPurchaseList linkedPurchaseList = new LinkedPurchaseList();
            linkedPurchaseList.setId(key1);
            LinkedPurchaseList existing = session.get(LinkedPurchaseList.class, key1);
            if (existing == null) {
                session.saveOrUpdate(linkedPurchaseList);
            }
        });
    }
}
