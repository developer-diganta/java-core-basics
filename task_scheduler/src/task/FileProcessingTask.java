package task;

public class FileProcessingTask implements Task, Runnable{
    private String name;

    public FileProcessingTask(String name){
        this.name = name;
    }


    @Override
    public void executeTask() throws InterruptedException {
        Thread t1 = new Thread(this);
        t1.start();
        t1.join();
    }

    @Override
    public String getTaskType() {
        return "File Processing Task";
    }

    @Override
    public void run() {
        System.out.println("Reading file: " + name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Reading Done");
    }
}
