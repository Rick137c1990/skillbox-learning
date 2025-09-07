import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;

        String[] components = data.split("\\s+");

        if (components.length <= 3) {
            throw new LessSetValuesException("you forgot something!!!");
        } else if (components.length > 4) {
            throw new MoreSetValuesException("Did you write too much!!");
        }
        String regexEmail = "[A-Za-z0-9]+@[a-z]+.[a-z]{2,3}";
        String email = components[2];
        String regexPhone = "[+]7[0-9]{10}";
        String phoneNumber = components[3];

        if (!email.matches(regexEmail)) {
            throw new WrongFormatEmailException("Incorrect mail format!!");
        } else if (!phoneNumber.matches(regexPhone)) {
            throw new WrongFormatPhoneException("the phone number format is incorrect!!");
        } else {
            String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
            storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));
        }
    }

    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}