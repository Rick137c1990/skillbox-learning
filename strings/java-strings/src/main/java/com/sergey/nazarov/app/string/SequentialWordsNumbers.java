package com.sergey.nazarov.app.string;

public class SequentialWordsNumbers {
    public static String sequentialWordsNumbers(String text) {
        StringBuilder builder = new StringBuilder();
        String word = "";
        int value = 0;

        for (int i = 0; i < text.length(); i++) {
            word += text.charAt(i);
            if (text.charAt(i) == ' ' || i + 1 == text.length()) {
                value++;
                builder.append("(" + value + ") " + word);
                word = "";
            }
        }
        return builder.toString();
    }
}
