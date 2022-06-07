package june7;

import java.util.Scanner;

public class QueueUsingLL {
    static Node head = null;
    static Node tail = null;
    static int size = 0;

    public static boolean isEmpty(){
        if(head==null && tail == null)
            return true;
        return false;
    }
    public static void enqueue(int ele) throws QueueOverflow {
        Node newNode = new Node(ele);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            System.out.println(ele+" enqueued");
            size++;
            return;

        }else{
            tail.next = newNode;
            tail=newNode;
            size++;
        }

    }
    public static int dequeue() throws QueueUnderflow {
        if(isEmpty()){
            throw new QueueUnderflow("Queue Underflow - You are popping an element from empty queue");
        }
        int popped = head.data;
        head = head.next;
        size--;
        if(size==0){
            head=null;
            tail=null;
        }
        return popped;
    }
    public static int peek() throws QueueUnderflow{
        if(isEmpty())
            throw new QueueUnderflow("No elements in queue");
        return head.data;
    }
    public static void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static boolean search(int ele){
        Node temp = head;
        boolean isFound = false;
        while (temp.next!=null){
            if(temp.data==ele){
                isFound=true;
                break;
            }
            temp = temp.next;
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


        }catch (QueueUnderflow e){
            System.out.println(e.getMessage());
        }
    }
}
