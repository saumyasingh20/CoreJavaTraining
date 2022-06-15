package MultiThreading;

public class RunnableDemo implements Runnable{
    @Override
    public void run() {
        System.out.println("thread is runnning "+this);

    }

    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo();
        Thread t = new Thread(r1);
        t.start();
        RunnableDemo r2 = new RunnableDemo();
        Thread t2 = new Thread(r2);
        t2.start();
        Thread t3 = new Thread(new RunnableDemo(),"myNewThread");
        t3.start();
        System.out.println(t3.getName());
    }
}
