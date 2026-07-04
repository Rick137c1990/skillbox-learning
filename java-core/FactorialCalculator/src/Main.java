import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number to calculate its factorial:");
        int factorial = 1;
        int value = new Scanner(System.in).nextInt();
        String message = value + "! = ";

        switch (value) {
            case 0 -> System.out.println("0 is not a natural number");
            case 1 -> System.out.println(message + value);
            case 2 -> System.out.println(message + "1 * " + value + " = " + value);
            default -> {
                if (value < 0) {
                    System.out.println("Negative numbers are not natural numbers");
                    break;
                }
                System.out.print(message);
                for (int i = 1; i <= value; i++) {
                    factorial = factorial * i;
                    System.out.print(i);
                    if (i < value) {
                        System.out.print(" * ");
                    }
                }
                System.out.print(" = " + factorial);
            }
        }
    }
}
