package task;

public class ComputationalTask implements Task{

    private int number;

    public ComputationalTask(int number){
        this.number=number;
    }
    @Override
    public void executeTask() {
        //executes a simple multiplication
        System.out.println(number*2);
    }

    @Override
    public String getTaskType() {
        return "Computational Task";
    }
}
