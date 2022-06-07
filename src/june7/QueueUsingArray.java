package june7;

import java.util.Scanner;

public class QueueUsingArray {
    static int front = -1;
    static int rear = -1;
    static int[] queue = new int[3];

    public static void enqueue(int ele) throws QueueOverflow {
        if(rear== queue.length-1){
           throw new QueueOverflow("Queue Overflow ! You have added elements more than queue's capacity");
        }
        if(front == -1 && rear == -1){
            queue[++rear] = ele;
            ++front;
            System.out.println(ele+" pushed to queue");
            return;

        }
        queue[++rear] = ele;
        System.out.println(ele+" pushed to queue");
        if(rear== queue.length-1){
            System.out.println("Queue reached maximum capacity");
        }
    }
    public static int dequeue() throws QueueUnderflow {
        if(rear<0){
            throw new QueueUnderflow("Queue Underflow - You are popping an element from empty queue");
        }
        int popped = queue[front];
        for (int i = 0;i<rear;i++){
            queue[i] = queue[i+1];
        }
        --rear;
        return popped;
    }
    public static void display(){
        for(int i = front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public static int peek(){
        if(front==-1){
            System.out.println("No element present in queue");
            return -1;
        }
        return queue[front];
    }
    public static boolean search(int element){
        boolean isFound = false;
        for (int i = front; i<=rear;i++){
            if(queue[i]==element){
                isFound=true;
                break;   }
        }
        return isFound;
    }
    public static void main(String[] args) throws QueueOverflow,QueueUnderflow {
        try {
            Scanner scan = new Scanner(System.in);
            int ch ;
            do {
                System.out.println("Enter your choice :");
                System.out.println(" 1. Enqueue");
                System.out.println(" 2. Dequeue");
                System.out.println(" 3. Peek");
                System.out.println(" 4. Display Queue");
                System.out.println(" 5. Search");
                System.out.println(" 6. Exit");
                ch = scan.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter element to be enqueued :");
                        int ele = scan.nextInt();
                        enqueue(ele);
                        break;
                    case 2:
                        int popped = dequeue();
                        System.out.println(popped + " dequeued");
                        break;
                    case 3:
                        System.out.println("Element at peek " + peek());
                        break;
                    case 4:
                        display();
                        break;
                    case 5:
                        System.out.println("Enter an element to search in the queue");
                        int elem = scan.nextInt();
                        boolean isFound = search(elem);
                        String ans = (isFound)?"Element present in queue":"Element not found in queue";
                        System.out.println(ans);
                        break;

                    case 6:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }while (ch!=6);


        }catch (QueueOverflow e){
            System.out.println(e.getMessage());
        }catch (QueueUnderflow e){
            System.out.println(e.getMessage());
        }
    }
}
