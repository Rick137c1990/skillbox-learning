import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       
        int value = new Random().nextInt(100);

        System.out.println("Hello!");
        
        while (true) {
            System.out.print("I have chosen a number.\n" +
                             "Enter your guess: ");

            int attempt = new Scanner(System.in).nextInt();

            if (attempt != value) {
                String hint = attempt > value ? "lower" : "higher";
                System.out.println("Incorrect, try again.\n" +
                                   "Hint: the number is " + hint + " than " + attempt);
            } else {
                System.out.print("Congratulations! You guessed it.\n" +
                                 "The number was " + value);
                break;
            }
        }
    }
}


