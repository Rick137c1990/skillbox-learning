package my.example.sergeynazarov;

public class Operator implements Employee {
    private double salaryOperator;

    public Operator() {
        double max = 50_000;
        double min = 45_000;
        max -= min;
        this.salaryOperator = (int) (Math.random() * ++max) + min;
    }

    @Override
    public double getMonthSalary() {
        return salaryOperator;
    }
}
