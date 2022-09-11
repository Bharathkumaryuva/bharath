public class MyThread implements Runnable{

    public static void main(String[] args) throws InterruptedException {
        MyThread myobj =new MyThread();
        Thread t1 = new Thread(myobj,"My thread 1");
        System.out.println(t1.getState());
        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getName());
        t1.join();
        System.out.println(t1.getState());
    }
    public void run(){
        System.out.println("run is called now");
    }

}
