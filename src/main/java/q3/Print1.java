package q3;

public class Print1 extends Thread {
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println("1 ");
            try{
                Thread.sleep(500);
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
    }
}
