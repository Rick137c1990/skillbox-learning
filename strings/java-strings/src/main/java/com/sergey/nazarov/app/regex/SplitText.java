package com.sergey.nazarov.app.regex;

public class SplitText {

    public static void main(String[] args) {
        String text = "the really cool day today";
        String splitText = splitTextIntoWords(text);
        System.out.println(splitText);
    }

    public static String splitTextIntoWords(String text) {
        StringBuilder builder = new StringBuilder();
        String regex = "[^a-zA-Z\\s]+";
        String newText = text.replaceAll(regex, "");
        String[] words = newText.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            builder.append(words[i]);
            if (i + 1 != words.length) {
                builder.append("\n");
            }
        }
        return builder.toString();
    }
}
