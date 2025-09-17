package groupId;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static Path path = Paths.get("config/getStatements.txt");
    public static Path pathDump = Paths.get("config/skillbox_dump_wfk.sql");
    public static void main(String[] args) {
        FactoryBuildTablesAndAddInfo factoryBuildTables = new FactoryBuildTablesAndAddInfo();
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Course.class)
                .addAnnotatedClass(LinkedPurchaseList.class)
                .addAnnotatedClass(PurchaseList.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Subscription.class)
                .addAnnotatedClass(Teacher.class)
                .buildSessionFactory();
       Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();

            factoryBuildTables.buildTables(session,path);

            factoryBuildTables.addInfoToTables(pathDump,session);

            factoryBuildTables.addInfoToLinkedPurchaseList(session);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            if (session.getTransaction() != null) {
                session.getTransaction().rollback();
            }
        } finally {
            session.close();
            factory.close();
        }
    }
}
