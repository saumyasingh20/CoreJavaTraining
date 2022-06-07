package june7;

import java.util.Scanner;

public class StackUsingLL {
    static Node head;

    public static void push(int ele)  {

        Node newNode = new Node(ele);
        newNode.next=head;
        head = newNode;
        System.out.println(ele+" pushed to stack");

    }
    public static int pop() throws StackUnderflow {
        if(head==null){
            throw new StackUnderflow("Stack Underflow - You are popping an element from empty stack");
        }
        int poppedElement = head.data;
        head=head.next;

        return poppedElement;
    }
    public static void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static int peek(){
        return head.data;
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
    public static void main(String[] args) throws StackUnderflow {
        try {
            Scanner scan = new Scanner(System.in);
            int ch ;
            do {
                System.out.println("Enter your choice :");
                System.out.println(" 1. Push");
                System.out.println(" 2. Pop");
                System.out.println(" 3. Peek");
                System.out.println(" 4. Display Stack");
                System.out.println(" 5. Search");
                System.out.println(" 6. Exit");
                ch = scan.nextInt();

                switch (ch) {
                    case 1:
                        System.out.println("Enter element to be pushed :");
                        int ele = scan.nextInt();
                        push(ele);
                        break;
                    case 2:
                        int popped = pop();
                        System.out.println(popped + " removed from stack");
                        break;
                    case 3:
                        System.out.println("Element at peek " + peek());
                        break;
                    case 4:
                        display();
                        break;
                    case 5:
                        System.out.println("Enter an element to search in the stack");
                        int elem = scan.nextInt();
                        boolean isFound = search(elem);
                        String ans = (isFound)?"Element present in stack":"Element not found in stack";
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


        } catch (StackUnderflow e){
            System.out.println(e.getMessage());
        }
    }
}
