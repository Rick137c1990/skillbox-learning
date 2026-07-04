import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int value = new Scanner(System.in).nextInt();
        System.out.println();
        for (int i = 1; i <= value; i = i + 1) {
            for (int j = value; j >= 1 ; j = j - 1) {
                if(i * j == value){
                    System.out.println(i + " * " + j);
                }
            }
        }
    }
}