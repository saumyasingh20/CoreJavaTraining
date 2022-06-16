package MultiThreading;

public class threadDemo extends Thread{
    threadDemo(String name){
        super(name);
    }
    threadDemo(){
        super();
    }
    public static void main(String[] args) throws InterruptedException {
        threadDemo t1 = new threadDemo();
       // t1.setPriority(MAX_PRIORITY);
        t1.setDaemon(true);
        System.out.println(t1.isDaemon() + " " +t1.getPriority());

        //t1.start();


//        t1.join();
////        System.out.println(t1.getState());
//       // t1.setPriority(20);
//        threadDemo t2 = new threadDemo();
//        t2.start();
//        t2.join();
//        t2.setPriority(8);
//        threadDemo t3 = new threadDemo();
//        t3.start();
//        t3.setPriority(10);
//        threadDemo t4 = new threadDemo();
//        t4.start();
////        System.out.println(t4.getThreadGroup());
//
//        threadDemo t5 = new threadDemo("ThreadFive");
//        t5.start();
//        System.out.println(Thread.currentThread());


    }
    public void display(){
        System.out.println("Name -  "+this.getName()+" priority - "+this.getPriority()+" state - "+ this.getState());
    }
    public void run(){ //when the thread is in running state
//        System.out.println(Thread.currentThread().getName());
//        this.display();
//        for (int i = 0; i<=3;i++){
//            System.out.println(i);
//            try{
//                Thread.sleep(3000);
//                System.out.println(this.getState());
//                System.out.println("my name is "+ Thread.currentThread().getName());
//            }catch (InterruptedException e){
//                System.out.println(e.getMessage());
//            }
//        }


//        for (int i = 0; i<=3;i++){
//            System.out.println(i+" "+ Thread.currentThread());
//            try{
//                Thread.sleep(2000);
//
//            }catch (InterruptedException e){
//                System.out.println(e.getMessage());
//            }
//        }
        System.out.println("priority "+Thread.currentThread().getPriority());

    }
}
