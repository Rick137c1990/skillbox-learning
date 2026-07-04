package my.example.sergeynazarov;

import java.util.*;

public class Company {
    private static double income;
    private String name;
    private int countStaff;
    private int countOperator;
    private int countManger;
    private int countTopManger;


    public Company(String name) {
        this.name = name;
    }

    ArrayList<Employee> staff = new ArrayList<>();

    public void hire(Employee employee) {
        if (employee instanceof Operator) {
            staff.add(new Operator());
            countOperator++;
        } else if (employee instanceof Manager) {
            staff.add(new Manager());
            countManger++;
        } else {
            staff.add(new TopManager());
            countTopManger++;
        }
        countStaff++;
    }

    public void hireAll(Employee employee, int countEmployees) {
        if (countEmployees > 0) {
            for (int i = 0; i < countEmployees; i++) {
                hire(employee);
            }
        }
    }

    public void fire(int countEmployees) { 
        for (int i = 0; i < countEmployees; i++) {
            int min = 0;
            int max = staff.size() - 1;
            max -= min;
            int result = (int) (Math.random() * ++max) - min;
            staff.remove(result);
            countStaff--;
        }
        int countTopMangerStay = 0;
        int countMangerStay = 0;
        int countOperatorStay = 0;
        for (Employee employee : staff) {
            if (employee instanceof TopManager) {
                countTopMangerStay++;
            } else if (employee instanceof Manager) {
                countMangerStay++;
            } else {
                countOperatorStay++;
            }
        }
        countTopManger = countTopMangerStay;
        countManger = countMangerStay;
        countOperator = countOperatorStay;
    }

    public static double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }


    public ArrayList<Employee> getTopSalaryStaff(int count) {
        staff.sort(Employee::reversed);
        ArrayList<Employee> topSalaryList = new ArrayList<>(staff.subList(0, count));
        return topSalaryList;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        staff.sort(Employee::compareTo);
        ArrayList<Employee> lowestSalaryList = new ArrayList<>(staff.subList(0, count));
        return lowestSalaryList;
    }

    public StringBuilder printSalary(List<Employee> list) {
        StringBuilder builder = new StringBuilder();
        for (Employee employee : list) {
            if (employee instanceof Operator) {
                builder.append("orator" + " -> " + employee.getMonthSalary() + " dollars\n");
            } else if (employee instanceof Manager) {
                builder.append("manager" + " -> " + employee.getMonthSalary() + " dollars\n");
            } else {
                builder.append("top manager" + " -> " + employee.getMonthSalary() + " dollars\n");
            }
        }
        return builder;
    }

    public ArrayList<Employee> getStaff() {
        return staff;
    }

    @Override
    public String toString() {
        return "java.example.sergeynazarov.Company: " + name + "\n" +
                "---------------------------\n" +
                "штат: " + countStaff + "\n" +
                "из ниx:\n" +
                "топ менеджеров: " + countTopManger + "\n" +
                "менеджеров:" + countManger + "\n" +
                "операторов: " + countOperator + "\n" +
                "---------------------------\n" +
                "доход компании состовляит: " + getIncome() + " руб.\n" +
                "----------------------------";
    }
}
