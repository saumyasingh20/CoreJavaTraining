package june8;

import june7.Node;
import june7.QueueOverflow;
import june7.QueueUnderflow;

import java.util.ArrayList;
import java.util.Scanner;

public class DoubleEndedQueue {
    static Node head = null;
    static Node tail = null;
    static int size = 0;

    public static void enqueue_front(int ele){
         Node newNode = new Node(ele);
         if(head==null&& tail ==null){
             head = newNode;
             tail = newNode;
             size++;
             return;
         }
        newNode.next = head;
        head=newNode;
        size++;

    }
    public static void enqueue_back(int ele){
        Node newNode = new Node(ele);
        if(head==null && tail ==null){
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail=newNode;
        size++;

    }
    public static int dequeue_front() throws QueueUnderflow {
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
    public static int dequeue_back() throws QueueUnderflow {
        if(isEmpty()){
            throw new QueueUnderflow("Queue Underflow - You are popping an element from empty queue");
        }
        int popped = tail.data;

        Node temp = head;
        Node prev = head;
        while (temp.next!=null){
            prev = temp;
            temp = temp.next;
        }
        prev.next=null;
        tail = prev;
        size--;

        if(size==0){
            head=null;
            tail=null;
        }
        return popped;
    }
    public static int getFront() throws QueueUnderflow {
        if(isEmpty() || head==null){
            throw new QueueUnderflow("Queue is Empty !");
        }
        return head.data;
    }
    public static int getRear() throws QueueUnderflow {
        if(isEmpty() || tail==null){
            throw new QueueUnderflow("Queue is Empty !");
        }
        return tail.data;

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
        while (temp!=null){
            if(temp.data==ele){
                isFound=true;
                break;
            }
            temp = temp.next;
        }
        return isFound;
    }
    public static boolean isEmpty(){
        if(size==0)
            return true;
        return false;
    }
    public static void main(String[] args) throws QueueUnderflow {
        try {
            Scanner scan = new Scanner(System.in);
            int ch ;
            do {
                System.out.println("Enter your choice :");
                System.out.println(" 1. Enqueue at front");
                System.out.println(" 2. Enqueue at back");
                System.out.println(" 3. Dequeue from front");
                System.out.println(" 4. Dequeue from back");
                System.out.println(" 5. Display Queue");
                System.out.println(" 6. Get Element at Front");
                System.out.println(" 7. Get Element at Back");
                System.out.println(" 8. Search");
                System.out.println(" 9. Exit");
                ch = scan.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter element to be enqueued at front :");
                        int ele = scan.nextInt();
                        enqueue_front(ele);
                        System.out.println(ele+" enqueued at front");
                        break;
                    case 2:
                        System.out.println("Enter element to be enqueued at back :");
                        int elem = scan.nextInt();
                        enqueue_back(elem);
                        System.out.println(elem+" enqueued at back");
                        break;
                    case 3:
                        int popped = dequeue_front();
                        System.out.println(popped + " dequeued from front");
                        break;
                    case 4:
                        popped = dequeue_back();
                        System.out.println(popped + " dequeued from back");
                        break;
                    case 5:
                        display();
                        break;
                    case 6:
                        System.out.println("Element at front " + getFront());
                        break;
                    case 7:
                        System.out.println("Element at back " + getRear());
                        break;

                    case 8:
                        System.out.println("Enter an element to search in the queue");
                        int element = scan.nextInt();
                        boolean isFound = search(element);
                        String ans = (isFound)?"Element present in queue":"Element not found in queue";
                        System.out.println(ans);
                        break;

                    case 9:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }while (ch!=9);


        }catch (QueueUnderflow e){
            System.out.println(e.getMessage());
        }
    }

}
