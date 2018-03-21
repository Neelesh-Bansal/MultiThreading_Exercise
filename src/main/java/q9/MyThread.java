package q9;

public class MyThread {
    public static void main(String[] args) {
//        Thread thread1 = new Thread(() -> t1());
//        thread1.start();
//        Thread thread2 = new Thread(() -> t2());
//        thread2.start();
        Thread thread1 = new Thread(MyThread::t1);
        Thread thread2 = new Thread(MyThread::t2);
        thread1.start();
        thread2.start();
    }



    public static synchronized void t1() {
        for (int i = 1; i <= 3; i = i + 2) {
            for (int j = i; j < 10; j = j + 4) {
                System.out.println("Thread " + i + ": " + j);
            }

        }

    }


        public static synchronized void t2() {
            int thread = 4;
            int print = 2;
            for (int i = 0; i <= 4; i++)
            {
                if (thread == 2)
                    thread = 4;
                else
                    thread = 2;
                System.out.println("Thread " + thread + ": " + print);

                print = print + 2;
            }

        }

}

