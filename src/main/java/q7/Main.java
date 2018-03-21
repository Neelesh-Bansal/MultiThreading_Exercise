package q7;

public class Main {
    // static int capacity=10;
    public static void main(String[] args) {
        Main main = new Main();
        Thread t1 = new Thread(main::publish);
        Thread t2 = new Thread(main::subscriber);
        t1.start();
        t2.start();

    }

    static int capacity = 0;

    public static boolean isfull() {
        if (capacity == 10)
            return true;
        return false;
    }

    public static boolean isEmpty() {
        if (capacity == 0)
            return true;
        return false;
    }

    public void publish() {
            synchronized (this) {
                while (isfull())
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                capacity += 1;
                System.out.println("Publisher published now the total capacity is : " + capacity);
                notify();

            }
        }

    public  void subscriber(){
            synchronized (this) {
                while (isEmpty())
                    try {
                        this.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                capacity -= 1;
                System.out.println("Subscriber subscribe \n Remaining item to subscribe : " +  capacity);
                notifyAll();

            }
         }
}

