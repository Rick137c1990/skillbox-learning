package com.sergey.nazarov.app.regex;

import java.util.Scanner;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }

            String codeSeven = "7";
            String codeEight = "8";
            String phone = "";
            String regex = "[^0-9]";
            String numbers = input.replaceAll(regex, "");
            if (numbers.length() == 10) {
                phone = codeSeven + numbers;
            } else if (numbers.indexOf(codeEight) != numbers.indexOf(0)) {
                phone += codeSeven + numbers.substring(1);
            } else if (numbers.indexOf(codeSeven) != numbers.indexOf(0)) {
                phone += numbers;
            }
            String regexPhone = "7[0-9]{10}";
            boolean checkRightPhone = phone.matches(regexPhone);
            System.out.println(checkRightPhone ?
                    phone : "nvalid number format");
        }
    }
}


