package practice;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new DepositAccount();
        bankAccount.put(999.99);
        System.out.println(bankAccount.getAmount());

    }
}
