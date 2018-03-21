package q1;
public class EvenThread implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 2; i <= 20; i = i + 2) {

            System.out.println(i);

        }
    }
}
