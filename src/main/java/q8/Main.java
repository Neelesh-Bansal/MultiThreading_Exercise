package q8;


import java.util.UUID;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
    int totalCapacity=10;
    static int currentCapacity=0;
    private BlockingQueue<String> queue = new ArrayBlockingQueue<>(1);

    public void publish()  {
        if(currentCapacity<totalCapacity) {

            String message = UUID.randomUUID().toString();
            try {
                queue.put(message);
                currentCapacity=currentCapacity+1;
            } catch (InterruptedException e) {
                e.printStackTrace();

            }

            System.out.println("Message published..." + message);
            System.out.println("Remaining Capacity " + currentCapacity);
        }
    }

    public void subscribe() {
        System.out.println("Hello");
        if(currentCapacity>0){

            String message = "";

            try {
                message = queue.take();
                //currentCapacity=currentCapacity-1;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Message subscribed..." + message);
            System.out.println("Remaining Capacity "+ currentCapacity);
        }
    }


    public static void main(String[] args) {
        Main main=new Main();
        Thread thread1=new Thread(main::publish);
        Thread thread2=new Thread(main::subscribe);
        thread1.start();
        thread2.start();

    }
}
