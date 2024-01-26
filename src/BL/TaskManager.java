package BL;

import DL.DataHandlerByStrings;

import java.util.ArrayList;

public class TaskManager {

    private DataHandlerByStrings data = new DataHandlerByStrings("src/data.txt");
    public ArrayList<String> getTasks(){
        return this.data.read();
    }
    public int length(){
        return getTasks().size();
    }
    public void addTask(String newTask){
        ArrayList<String> tasks = getTasks();
        tasks.add(newTask);
        this.data.write(String.join("\n", tasks));
    }

    public void removeTask(String string){
        int index = this.data.search(string);
        this.data.remove(index);
    }
}


