import java.io.*;

class A extends Thread{
    public void run(){
        for(int i = 1; i <= 5; i++){
            System.out.println(i + "*" + 5 + "=" + (i*5));
        }
        System.out.println("End of the 1st Thread");
    }
}
class B extends Thread{
    public void run(){
        for(int j = 1; j <= 6; j++){
            System.out.println(j + "*" + 6 + "=" + (j*6));
        }
        System.out.println("End of the 2nd Thread");
    }
}
class C extends Thread{
    public void run(){
        for(int k = 1; k <= 7; k++){
            System.out.println(k + "*" + 7 + "=" + (k*7));
        }
        System.out.println("End of the 3rd Thread");
    }
}
public class ThreadExample{
    public static void main(String args[])throws IOException{ 
        A ThreadA = new A();
        B ThreadB = new B();
        C ThreadC = new C();
        ThreadA.setPriority(Thread.MAX_PRIORITY);
        ThreadB.setPriority(Thread.NORM_PRIORITY); 
        ThreadC.setPriority(Thread.MIN_PRIORITY);
        ThreadA.start();
        ThreadB.start();
        ThreadC.start();
              
    }
}