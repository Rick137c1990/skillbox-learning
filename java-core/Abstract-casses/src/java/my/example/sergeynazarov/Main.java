package my.example.sergeynazarov;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("Tинькофф банк");
        company.setIncome(100_000_000);
        company.hireAll(new Operator(), 180);
        company.hireAll(new Manager(), 80);
        company.hireAll(new TopManager(), 10);

        System.out.println(company);

        System.out.println("Топ высоких зарплат:");
        System.out.println(company.printSalary(company.getTopSalaryStaff(15)));
        System.out.println("Топ низких зарплат:");
        System.out.println(company.printSalary(company.getLowestSalaryStaff(30)));

        company.fire(50);
        System.out.println("произошло увольнение");
        System.out.println();

        System.out.println(company);

        System.out.println("Топ высоких зарплат:");
        System.out.println(company.printSalary(company.getTopSalaryStaff(15)));
        System.out.println("Топ низких зарплат:");
        System.out.println(company.printSalary(company.getLowestSalaryStaff(30)));

    }
}
