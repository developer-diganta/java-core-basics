import javax.annotation.processing.SupportedSourceVersion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<9;i+=2){
            System.out.println("FROM 1st thread, "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Thread th = new MyThread();
        th.start();
        Thread th2 = new Thread(()->{
           for(int i=1;i<10;i+=2){
               System.out.println(i);
               try {
                   Thread.sleep(2000);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
           }
        });
        th2.start();
//        th2.interrupt();
    }
}