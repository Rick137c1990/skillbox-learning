package practice.reverseArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String line = "Every hunter wants to know where the pheasant sits";
        String[] lines = line.split(" ");
        ReverseArray.reverse(lines);
        System.out.println(Arrays.toString(lines));
    }
}
