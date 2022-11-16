import java.util.Random;

public class ClassRunnable implements Runnable {


    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println(this);
    }
}