public class Transfer implements Runnable{
    private final Account accountFrom;
    private final Account accountTo;
    private final Bank bank;
    private final long sum;

    public Transfer(Bank bank,Account accountFrom, Account accountTo, long sum) {
        this.bank = bank;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.sum = sum;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            bank.transfer(accountFrom.getAccNumber(), accountTo.getAccNumber(), sum);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
