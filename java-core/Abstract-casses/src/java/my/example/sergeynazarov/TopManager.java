package my.example.sergeynazarov;

public class TopManager implements Employee {
    private double salaryTopManager;

    public TopManager() {
        double maxFix = 150_000;
        double minFix = 130_000;
        maxFix -= minFix;
        double fixSalary = (int) (Math.random() * ++maxFix) + minFix;

        if (Company.getIncome() > 10_000_000) {
            this.salaryTopManager = fixSalary / 100 * 150 + fixSalary;
        }
    }

    @Override
    public double getMonthSalary() {
        return salaryTopManager;
    }
}
