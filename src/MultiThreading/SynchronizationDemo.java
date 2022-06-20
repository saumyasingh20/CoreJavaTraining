package MultiThreading;
class Task{
    int i = 0;
    //synchronised method
    public synchronized void display(){

        System.out.println(this.i+" "+Thread.currentThread().getName());
        this.i++;
            try{
               // Thread.sleep(2000);
                if(this.i==1){
                    wait();
                    incAndNotify();
                }
     }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }

    public synchronized void incAndNotify(){
        this.i++;
        //System.out.println(i+" "+Thread.currentThread().getName());
        notify();
    }

    //synchronised block
    public void display2(){
        synchronized (this){
            for (int i = 1; i <=3 ; i++) {
                System.out.println(i+" "+Thread.currentThread().getName());
                try{
                    Thread.sleep(2000);
                }catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
        }

    }
    //static synchronised method
    public synchronized static void display3(){
        for (int i = 1; i <=3 ; i++) {
            System.out.println(i+" "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }

}
class MyThreadClass extends Thread{
    Task t;
    MyThreadClass(String name,Task t){
        super(name);
        this.t = t;
    }
    public void run(){
        t.display();
       // t.incAndNotify();

         // t.display2();
//        Task.display3();
    }
}
class ThreadTwo extends Thread{
    Task t;
    ThreadTwo(String name,Task t){
        super(name);
        this.t = t;
    }
    public void run(){
        t.incAndNotify();
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) throws InterruptedException {
        Task t = new Task();
        MyThreadClass t1 = new MyThreadClass("threadOne",t);
        ThreadTwo t2 = new ThreadTwo("threadTwo",t);


        t1.start();
        //t1.join();
        t2.start();

    }
}
