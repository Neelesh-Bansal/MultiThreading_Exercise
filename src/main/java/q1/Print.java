package q1;

public class Print {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new OddThread());
        Thread thread2 = new Thread(new EvenThread());
        thread1.setName("Odd Thread");
        thread2.setName("Even Thread");
        thread1.start();
        thread2.start();
    }
}
