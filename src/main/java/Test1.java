import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        Map<String, Account> map = new HashMap<>();
        Bank bank = new Bank();
        bank.setAccounts(map);

        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        account1.setAccNumber("123");
        account1.setMoney(10000);

        account2.setAccNumber("234");
        account2.setMoney(20000);

        account3.setAccNumber("456");
        account3.setMoney(400000);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);

        System.out.println(account1.getMoney());
        System.out.println(account2.getMoney());
        System.out.println(account3.getMoney());

        bank.getTransfer(account1.getAccNumber(),account2.getAccNumber(),7000);//
        bank.getTransfer(account2.getAccNumber(),account3.getAccNumber(),100000);
        bank.getTransfer(account3.getAccNumber(),account1.getAccNumber(),700000);
        bank.getTransfer(account3.getAccNumber(),account1.getAccNumber(),10000);
        bank.getTransfer(account1.getAccNumber(),account2.getAccNumber(),700000);
        bank.getTransfer(account3.getAccNumber(),account2.getAccNumber(),300000);

        System.out.println(account1.getMoney());
        System.out.println(account2.getMoney());
        System.out.println(account3.getMoney());

    }
}
