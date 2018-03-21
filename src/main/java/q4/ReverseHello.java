package q4;

public class ReverseHello {

    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        thread1.start();
    }

}

class Thread1 extends Thread{
    public void run(){

        Thread2 thread2=new Thread2();
        thread2.start();
        try{
            thread2.join();
        }
        catch(Exception e){
        }
        System.out.println("Hello From Thread 1");

    }
}
class Thread2 extends Thread{
    public void run(){

        Thread3 thread3=new Thread3();
        thread3.start();
        try{
            thread3.join();
        }
        catch(Exception e){
        }
        System.out.println("Hello From Thread 2");
    }
}
class Thread3 extends Thread{
    public void run(){
        Thread4 thread4=new Thread4();
        thread4.start();
        try{
            thread4.join();
        }
        catch(Exception e){
        }
        System.out.println("Hello From Thread 3");
    }
}

class Thread4 extends Thread{
    public void run(){
        Thread5 thread5=new Thread5();
        thread5.start();
        try{
            thread5.join();
        }
        catch(Exception e){
        }
        System.out.println("Hello From Thread 4");
    }
}
class Thread5 extends Thread{
    public void run(){
        Thread6 thread6=new Thread6();
        thread6.start();
        try{
            thread6.join();
        }
        catch(InterruptedException e){
        }
        System.out.println("Hello From Thread 5");
    }
}
class Thread6 extends Thread{
    public void run(){
        Thread7 thread7=new Thread7();

        thread7.start();
        try{
           thread7.join();
        }
        catch(InterruptedException e){
        }
        System.out.println("Hello From Thread 6");
    }
}
class Thread7 extends Thread{
    public void run(){
        Thread8 thread8=new Thread8();
        thread8.start();
        try{
            thread8.join();
        }
        catch(InterruptedException e){
        }
        System.out.println("Hello From Thread 7");
    }
}
class Thread8 extends Thread{
    public void run(){
        Thread9 thread9=new Thread9();
        thread9.start();
        try{
            thread9.join();
        }
        catch(InterruptedException e){
        }
        System.out.println("Hello From Thread 8");
    }
}
class Thread9 extends Thread{
    public void run(){
        Thread10 thread10=new Thread10();
        thread10.start();
        try{
            thread10.join();
        }
        catch(InterruptedException e){
        }
        System.out.println("Hello From Thread 9");
    }
}
class Thread10 extends Thread{
    public void run(){

        System.out.println("Hello From Thread 10");

    }
}
