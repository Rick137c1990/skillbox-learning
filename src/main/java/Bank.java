import java.util.Map;
import java.util.Random;

public class Bank {

    private Map<String, Account> accounts;

    private final Random random = new Random();
    public void getTransfer(String fromAccountNum, String toAccountNum ,long amount){
        new Transfer(this,accounts.get(fromAccountNum), accounts.get(toAccountNum), amount);
    }

    public synchronized boolean isFraud(String fromAccountNum, String toAccountNum, long amount)
        throws InterruptedException {
        Thread.sleep(1000);
        return random.nextBoolean();
    }

    public void transfer(String fromAccountNum, String toAccountNum, long amount) throws InterruptedException {
        long balanceOfFromAccountNum = accounts.get(fromAccountNum).getMoney();

        // Проверка наличия достаточно средств на счете
        if (!hasEnoughMoney(balanceOfFromAccountNum, amount)) {
            massageOfLittleMoney();
            return;
        }

        // Проверка на мошенничество для крупных сумм
        if (amount > 50000 && isFraud(fromAccountNum, toAccountNum, amount)) {
            handleFraud(fromAccountNum, toAccountNum);
            return;
        }

        // Проверка на заблокированные аккаунты до захвата блокировок
        if (areAccountsBlocked(fromAccountNum, toAccountNum)) {
            massageIsBlocking(fromAccountNum, toAccountNum);
            return;
        }

        // Синхронизация блокировок в правильном порядке
        String firstLock = getLockOrder(fromAccountNum, toAccountNum);
        String secondLock = firstLock.equals(fromAccountNum) ? toAccountNum : fromAccountNum;

        synchronized (firstLock) {
            synchronized (secondLock) {
                // После захвата блокировок, безопасно выполняем перевод
                long balanceOfToAccountNum = accounts.get(toAccountNum).getMoney();

                if (isTransferPossible(fromAccountNum, toAccountNum)) {
                    performTransfer(fromAccountNum, toAccountNum, balanceOfFromAccountNum, balanceOfToAccountNum, amount);
                } else {
                    massageIsBlocking(fromAccountNum, toAccountNum);
                }
            }
        }
    }

    private boolean hasEnoughMoney(long balance, long amount) {
        return balance >= amount && amount > 0;
    }

    private boolean isTransferPossible(String fromAccountNum, String toAccountNum) {
        return !accounts.get(fromAccountNum).isBlock() && !accounts.get(toAccountNum).isBlock();
    }

    private void handleFraud(String fromAccountNum, String toAccountNum) {
        massageIsBlocking(fromAccountNum, toAccountNum);
        accounts.get(fromAccountNum).setBlock(true);
        accounts.get(toAccountNum).setBlock(true);
    }

    private boolean areAccountsBlocked(String fromAccountNum, String toAccountNum) {
        return accounts.get(fromAccountNum).isBlock() || accounts.get(toAccountNum).isBlock();
    }

    private String getLockOrder(String fromAccountNum, String toAccountNum) {
        return fromAccountNum.compareTo(toAccountNum) < 0 ? fromAccountNum : toAccountNum;
    }

    private void performTransfer(String fromAccountNum, String toAccountNum, long balanceOfFromAccountNum, long balanceOfToAccountNum, long amount) {
        accounts.get(fromAccountNum).setMoney(balanceOfFromAccountNum - amount);
        accounts.get(toAccountNum).setMoney(balanceOfToAccountNum + amount);
        showBalance(fromAccountNum);
        showBalance(toAccountNum);
    }

    private  long getBalance(String accountNum) {
        Account account = accounts.get(accountNum);
        if(account != null){
            return accounts.get(accountNum).getMoney();
        }
       return -1;
    }

    public void showBalance(String accountNum){
        long balance = getBalance(accountNum);
        if(balance == -1){
            System.out.println("нет такого аккаунта");
        }else {
            System.out.println(balance);
        }
    }

    public long getSumAllAccounts() {
        long sum = 0;
        for (Map.Entry<String, Account> stringAccountEntry : accounts.entrySet()) {
            sum += stringAccountEntry.getValue().getMoney();
        }
        return sum;
    }

    public Map<String, Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Map<String, Account> accounts) {
        this.accounts = accounts;
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccNumber(), account);
    }
    public void addAccount (Map <String, Account> newAccounts){
        accounts.putAll(newAccounts);
    }
    private void massageOfLittleMoney(){
        System.out.println("не достаточно средств");
    }

    public void massageIsBlocking(String fromAccountNum, String toAccountNum){
        System.out.println("счет " + accounts.get(fromAccountNum).getAccNumber() + " заблокирован на причине " +
                "подозрителного перевода");
        System.out.println("счет " + accounts.get(toAccountNum).getAccNumber() + " заблокирован на причине " +
                "подозрителного перевода");

    }
}
