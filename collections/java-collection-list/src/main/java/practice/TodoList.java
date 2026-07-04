package practice;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> toDoList = new ArrayList<>();

    public void add(String todo) {
        toDoList.add(todo);
    }

    public void add(int index, String todo) {
        if (index < toDoList.size()) {
            toDoList.add(index, todo);
        } else {
            toDoList.add(todo);
        }
    }

    public void edit(int index, String todo) {
        if (index < toDoList.size()) {
            toDoList.remove(index);
            toDoList.add(index, todo);
        }
    }

    public void delete(int index) {
        if (index < toDoList.size()) {
            toDoList.remove(index);
        }
    }

    public ArrayList<String> getTodos() {
        return toDoList;
    }

}