package MultiThreading;

public class threadDemo extends Thread{
    public static void main(String[] args) {
        threadDemo t1 = new threadDemo();
        t1.setPriority(9);
        t1.start();
//        System.out.println(t1.getState());
       // t1.setPriority(20);
        threadDemo t2 = new threadDemo();
        t2.start();
        t2.setPriority(8);
//        threadDemo t3 = new threadDemo();
//        t3.start();
//        t3.setPriority(10);
//        threadDemo t4 = new threadDemo();
//        t4.start();
//        System.out.println(t4.getThreadGroup());


    }
    public void display(){
        System.out.println("Name -  "+this.getName()+" priority - "+this.getPriority()+" state - "+ this.getState());
    }
    public void run(){ //when the thread is in running state
//        System.out.println(Thread.currentThread().getName());
//        this.display();
        for (int i = 0; i<=3;i++){
            System.out.println(i);
            try{
                Thread.sleep(3000);
                System.out.println(this.getState());
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }

    }
}
