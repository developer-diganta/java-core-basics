package task;

public interface Task {
    public void executeTask() throws InterruptedException;

    public String getTaskType();

}
