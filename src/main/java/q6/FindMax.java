package q6;


public class FindMax extends Thread {
    private int first;
    private int last;
    int[] arr;
    int max=0;

    FindMax(int first,int last,int[] findMax){
        this.first=first;
        this.last=last;
        this.arr=findMax;

    }


    public void run(){

        for(int i=first;i<=last;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Exiting from run"+Thread.currentThread());
    }


    public int getMax()
    {
        return max;
    }

}


class result{
    public static void main(String[] args) {

        int[] findsum={1,2,3,4,5,6,7,5,4,3,2};
        int max=0;

        FindMax thread1 = new FindMax(0,2,findsum);
        FindMax thread2 = new FindMax(3,5,findsum);
        FindMax thread3 = new FindMax(6,8,findsum);
        FindMax thread4 = new FindMax(9,10,findsum);


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

        int t1 = thread1.getMax();
        int t2 = thread2.getMax();
        if(t1>t2)
            max=t1;
        int t3 = thread3.getMax();
        if(t3>max)
            max=t3;
        int t4 = thread4.getMax();
        if(t4>max)
            max=t4;
        System.out.println("Max="+max);

    }
}
