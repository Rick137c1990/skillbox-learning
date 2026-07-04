package practice;

import java.util.Scanner;

public class Main {
    private static TodoList todoList = new TodoList();

    public static void main(String[] args) {
        while (true) {
            System.out.print("введите команду: ");
            String input = new Scanner(System.in).nextLine().strip();
            String[] parts = input.split("\\s+");
            String command = findCommand(parts[0]);
            String value = findIndex(parts);
            String text = buildText(parts, value);
            String index = "-1";

            switch (command) {
                case "LIST":
                    System.out.println(todoList.getTodos());
                    break;
                case "ADD":
                    if (value.equals(index)) {
                        todoList.add(text);
                    } else {
                        todoList.add(Integer.parseInt(value), text);
                    }
                    break;
                case "EDIT":
                    if (!value.equals(index)) {
                        todoList.edit(Integer.parseInt(value), text);
                    }
                    break;
                case "DELETE":
                    if (!value.equals(index)) {
                        todoList.delete(Integer.parseInt(value));
                    }
                    break;
                default:
                    System.out.println(command);
            }
        }
    }

    public static String buildText(String[] parts, String value) {
        String text = "";
        int i;
        if (value == "-1") {
            i = 1;
        } else {
            i = 2;
        }
        for (; i < parts.length; i++) {
            text += parts[i] + " ";
        }
        return text;
    }

    public static String findCommand(String word) {
        String[] commands = {"ADD", "LIST", "EDIT", "DELETE"};
        for (int i = 0; i < commands.length; i++) {
            if (word.equals(commands[i])) {
                return word = commands[i];
            }
        }
        return "команда не найдена";
    }

    public static String findIndex(String[] parts) {
        String index = "-1";
        if (parts.length - 1 > 0) {
            String regex = "[0-9]";
            if (parts[1].matches(regex)) {
                index = parts[1];
            }
        }
        return index;
    }
}
