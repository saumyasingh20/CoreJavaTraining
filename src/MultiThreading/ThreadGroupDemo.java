package MultiThreading;

public class ThreadGroupDemo extends Thread{
    public void run(){
        System.out.println(this);
    }
    ThreadGroupDemo(ThreadGroup tg, String name){
        super(tg,name);
    }
    public static void main(String[] args) {
        ThreadGroup g = new ThreadGroup("newGroup");
        ThreadGroupDemo t1 = new ThreadGroupDemo(g,"threadOne");
        t1.start();
        ThreadGroupDemo t2 = new ThreadGroupDemo(g,"threadTwo");
        t2.start();
        ThreadGroupDemo t3 = new ThreadGroupDemo(g,"threadThree");
        t3.start();
        System.out.println(g.activeCount());
        ThreadGroupDemo[] arr= new ThreadGroupDemo[3];
        g.enumerate(arr);
//        System.out.println(arr);
        for(Thread a :arr){
            System.out.println(a);
        }
    }
}
