package practice;

public class BankAccount {
    protected double sum;

    public double getAmount() {
        return sum;
    }

    public void put(double amountToPut) {
        if (amountToPut > 0) {
            sum += amountToPut;
        }
    }

    public void take(double amountToTake) {
        if (amountToTake < sum) {
            sum -= amountToTake;
        }
    }
}

