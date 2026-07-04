package my.example.sergeynazarov;

public interface Employee extends Comparable<Employee> {
    double getMonthSalary();

    @Override
    default int compareTo(Employee o) {
        return (int) (this.getMonthSalary() - o.getMonthSalary());
    }

    default int reversed(Employee o) {
        return (int) (o.getMonthSalary() - this.getMonthSalary());
    }
}
