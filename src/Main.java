import DL.DataHandlerByObjects;
import DL.Priority;
import DL.Status;
import DL.Task;
import UI.ConsoleUI;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        ConsoleUI.run();
//        Task task = new Task("Написать программу", Status.NEW, 5, Priority.MEDIUM);
//
//        DataHandlerByObjects data = new DataHandlerByObjects("src/data_1.txt");
//        System.out.println(data.read());
//        System.out.println(Status.get("HAYK"));

    }

    public static ArrayList<Task> getTasks(){
        ArrayList<Task> tasks = new ArrayList<>();
        tasks.add(new Task("1 Написать программу", Status.NEW, 5, Priority.MEDIUM));
        tasks.add(new Task("2 Написать программу", Status.NEW, 5, Priority.MEDIUM));
        tasks.add(new Task("3 Написать программу", Status.NEW, 5, Priority.MEDIUM));
        return tasks;
    }

    public static ArrayList<Task> addTask(Task task){
        ArrayList<Task> tasks = getTasks();
        tasks.add(new Task("4 Написать программу", Status.NEW, 5, Priority.MEDIUM));
        return tasks;
    }
}

