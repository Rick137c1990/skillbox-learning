package practice;
import java.util.Scanner;
public class Main {
    public static final String WRONG_EMAIL_ANSWER = "this format of email is incorrect";

    public static void main(String[] args) {
        EmailList emailList = new EmailList();
        Scanner scanner = new Scanner(System.in);
        String command = "";
        String email = "";
        while (true) {
            System.out.println("input the command or  \"0\"");
            String input = scanner.nextLine().strip();
            if (input.equals("0")) {
                break;
            }else {
                String[] parts = input.split("\\s+");
                command = findCommand(parts);
                email = findText(parts);

                switch (command){
                    case "LIST":
                        System.out.println(emailList);
                        break;
                    case "ADD":
                            emailList.add(email);
                            if(EmailList.error == false){
                                System.out.println(WRONG_EMAIL_ANSWER);
                            }
                        break;
                    default:
                        System.out.println(command);
                        break;
                }
            }
        }
    }
    public static String findCommand(String[] parts){
        String word = parts[0];
        String[] commands = {"ADD", "LIST"};
        String command = "";
        for (int i = 0; i < commands.length; i++) {
            if(word.equals(commands[i])){
                command = commands[i];
                break;
            }else {
                command = "the command wan not found";
            }
        }
        return command;
    }
    public static String findText(String[] parts){
        String email = "";
        if(!email.isBlank() && parts.length - 1 > 0){
           email = parts[1];
        }
        return email;
    }
}
