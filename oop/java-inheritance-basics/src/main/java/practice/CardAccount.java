package practice;

public class CardAccount extends BankAccount {
    @Override
    public void take(double amountToTake) {
        double onePercent = amountToTake / 100.0;
        if (sum > amountToTake + onePercent) {
            super.take(amountToTake);
            sum -= onePercent;
        }
    }
}
