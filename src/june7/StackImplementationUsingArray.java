package june7;

import java.util.Scanner;

public class StackImplementationUsingArray {
    static int top = -1;
    static int[] arr = new int[3];

    public static void push(int ele) throws StackOverflow {
        if(top== arr.length-1){
            throw new StackOverflow("Stack Overflow - You have added elements more than stack's capacity");
        }
        arr[++top] = ele;
        System.out.println(ele+" pushed to stack");
        if(top== arr.length-1){
            System.out.println("Stack reached maximum capacity");
        }
    }
    public static int pop() throws StackUnderflow {
        if(top<0){
            throw new StackUnderflow("Stack Underflow - You are popping an element from empty stack");
        }
        return arr[top--];
    }
    public static void display(){
        for(int i = 0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int peek(){
        return arr[top];
    }
    public static boolean search(int element){
        boolean isFound = false;
        for (int i = 0; i<=top;i++){
            if(arr[i]==element){
                isFound=true;
            }
        }
        return isFound;
    }

    public static void main(String[] args) throws StackOverflow,StackUnderflow {
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


        }catch (StackOverflow e){
            System.out.println(e.getMessage());
        }catch (StackUnderflow e){
            System.out.println(e.getMessage());
        }
    }
}
