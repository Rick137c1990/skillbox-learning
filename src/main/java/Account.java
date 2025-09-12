public class Account {

    private long money;
    private String accNumber;
    private boolean isBlock = false;

    public boolean isBlock() {
        return isBlock;
    }

    public void setBlock(boolean block) {
        isBlock = block;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        if (money > 0) {
            this.money = money;
        }
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    @Override
    public String toString() {
        return "Account{" +
                "money=" + money +
                ", accNumber='" + accNumber + '\'' +
                '}';
    }
}
