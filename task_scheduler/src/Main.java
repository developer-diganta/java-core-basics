import task.ComputationalTask;
import task.FileProcessingTask;
import task.Task;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> taskList = new ArrayList<Task>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter task type, followed by value. If done, press E else C to continue");
        int control=1;
        do{
            String s;
            s=sc.nextLine();
            Task task;
            if(Objects.equals(s, "Computational Task")){
                int n;
                n=Integer.parseInt(sc.nextLine());
                 task = new ComputationalTask(n);

            }else{
                String name;
                name=sc.nextLine();
                 task = new FileProcessingTask(name);
            }
            taskList.add(task);
            control= Integer.parseInt(sc.nextLine());
        }while(control==1);
//        System.out.println(taskList);
        TaskScheduler scheduler = new TaskScheduler(taskList.size());
        taskList.forEach(scheduler::submitTask);
    }
}