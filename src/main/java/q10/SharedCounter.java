package q10;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SharedCounter extends Thread{
    static int count=0;
    public SharedCounter(String name) {
        super(name);
    }

    public void run(){

        synchronized (this){

            for (int i =0;i<1000;i++){
                count++;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i=0;i<5;i++){
            Runnable shared = new SharedCounter("Thread"+i);
            executorService.execute(shared);
        }

        executorService.shutdown();

        while (!executorService.isTerminated()){

        }
        System.out.println(count);
    }
}

