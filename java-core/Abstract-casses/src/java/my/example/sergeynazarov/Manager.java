package my.example.sergeynazarov;

public class Manager implements Employee {
    private double salaryManager;

    public Manager() {
        double maxFix = 90_000;
        double minFix = 85_000;
        maxFix -= minFix;
        double fixSalary = (int) (Math.random() * ++maxFix) + minFix;

        double max = 140_000;
        double min = 115_000;
        max -= min;
        double result = (int) (Math.random() * ++max) + min;

        this.salaryManager = result / 100 * 5 + fixSalary;
    }

    @Override
    public double getMonthSalary() {
        return salaryManager;
    }
}
