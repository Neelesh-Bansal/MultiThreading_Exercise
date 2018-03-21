package q2;

public class Print {
    public static void main(String[] args) {
        Prime prime = new Prime();
        NonPrime nonPrime = new NonPrime();
        prime.start();
        nonPrime.start();
    }
}

class Prime extends Thread{
    int fact;
    public void run(){
        for(int i=1; i<=20; i++)
        {
            fact=0;
            for(int j=1; j<=20; j++)
            {
                if(i%j==0)
                    fact++;
            }
            if(fact==2)
                System.out.print(i+" ");
        }
        System.out.println("\n");
    }

}

class NonPrime extends Thread{
    int fact;
    public void run(){
        for(int i=1; i<=20; i++)
        {
            fact=0;
            for(int j=1; j<=20; j++)
            {
                if(i%j==0)
                    fact++;
            }
            if(fact!=2)
                System.out.print(i+" ");
        }

    }
}

