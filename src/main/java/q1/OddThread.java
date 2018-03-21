package q1;

public class OddThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 1; i <= 19; i = i + 2) {
            System.out.println(i);
        }
    }
}
