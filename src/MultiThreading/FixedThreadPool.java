package MultiThreading;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class FixedThreadPool extends Thread{
    public void run(){
        for (int i = 1;i<=3;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }

        }
    }
    public static void main(String[] args) {
       final int THREAD_CAPACITY = 5;
       ExecutorService e = Executors.newFixedThreadPool(THREAD_CAPACITY);

       for (int i = 0; i<THREAD_CAPACITY;i++){
           e.execute(new FixedThreadPool());
       }
       e.shutdown();

    }
}
