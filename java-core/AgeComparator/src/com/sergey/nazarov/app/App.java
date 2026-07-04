package com.sergey.nazarov.app;

public class App {
    public static void main(String[] args) {

        int mishaAge = 10;
        int katiaAge = 65;
        int jonAge = 34;

        int[] ages = getAgesOrder(mishaAge, katiaAge, jonAge);
        System.out.println("min " + ages[0] + " age \n" + "middle " + ages[1] + " age \n" + "max " + ages[2] + " age \n");
    }

    public static int[] getAgesOrder(int age1, int age2, int age3) {

        int min, middle, max;

        if (age1 < age2 && age1 < age3) min = age1;
        else if (age2 < age1 && age2 < age3) min = age2;
        else min = age3;

        if (age1 > age2 && age1 > age3) max = age1;
        else if (age2 > age1 && age2 > age3) max = age2;
        else max = age3;

        middle = age1 + age2 + age3 - min - max;
        return new int[]{min, middle, max};
    }
}

