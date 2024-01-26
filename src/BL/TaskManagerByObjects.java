
package BL;


import DL.DataHandlerByObjects;
import DL.Task;
import java.util.ArrayList;

public class TaskManagerByObjects {
    private DataHandlerByObjects data = new DataHandlerByObjects("src/data_1.txt");

    public ArrayList<Task> getTasks(){
        return this.data.read();
    }
    public int length(){
        return this.data.read().size();
    }
    public void addTask(Task newTask){
        this.data.write(newTask);
    }

    public void removeTask(String substring){
        int id = this.data.search(substring);
        this.data.remove(id);
    }


}
