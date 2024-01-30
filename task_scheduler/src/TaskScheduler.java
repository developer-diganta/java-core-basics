import task.Task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskScheduler {
    private ExecutorService executorService;

    public TaskScheduler(int maxThreads) {
        this.executorService = Executors.newFixedThreadPool(maxThreads);
    }

    public void submitTask(Task task) {
        executorService.submit(() -> {
            System.out.println("Executing " + task.getTaskType() + " task...");
            try {
                task.executeTask();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public void shutdown() {
        executorService.shutdown();
    }
}