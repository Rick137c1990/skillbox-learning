package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class EmailList {
    ArrayList<String> arrayList = new ArrayList<>();
    static boolean error;

    public void add(String email) {
        String regex = "[A-Za-z0-9]+@[A-Za-z0-9]+[.][A-Za-z]{2,4}";
        if (email.matches(regex)) {
            String inCorrectEmail = email.toLowerCase();
            error = arrayList.add(inCorrectEmail);
        }
    }

    public List<String> getSortedEmails() {
        TreeSet<String> sortList = new TreeSet<>();
        sortList.addAll(arrayList);
        arrayList.clear();
        arrayList.addAll(sortList);
        return arrayList;
    }

    @Override
    public String toString() {
        String text = "";
        for (String s : arrayList) {
            text += s + "\n";
        }
        return text;
    }
}
