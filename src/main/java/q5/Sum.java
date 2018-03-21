package q5;

public class Sum extends Thread {
    private int first;
    private int last;
    int[] arr;
    int sum=0;

    Sum(int first,int last,int[] findSum){
        this.first=first;
        this.last=last;
        this.arr=findSum;

    }


    public void run(){
        for(int i=first;i<=last;i++){
            sum=sum+arr[i];
        }
        System.out.println("Exiting from run"+Thread.currentThread());
    }


    public int getSum(){
        return sum;
    }

}


class result{
    public static void main(String[] args) {

        int[] findsum={1,2,3,4,5,6,7,8,9,10,11};

        Sum thread1 = new Sum(0,2,findsum);
        Sum thread2 = new Sum(3,5,findsum);
        Sum thread3 = new Sum(6,8,findsum);
        Sum thread4 = new Sum(9,10,findsum);


        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();

        try{
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println("Exiting from main");

        int t1 = thread1.getSum();
        int t2 = thread2.getSum();
        int t3 = thread3.getSum();
        int t4 = thread4.getSum();
        int sum=t1+t2+t3+t4;
        System.out.println("Sum="+sum);

    }
}
