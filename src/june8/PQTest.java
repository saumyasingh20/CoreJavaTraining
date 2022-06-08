package june8;

import java.util.Scanner;

public class PQTest {
    public static void main(String[] args) throws EmptyPQException {

       try{
           Scanner scan = new Scanner(System.in);
           Priority_Queue<Object> pq  = new Priority_Queue<>();
           int ch ;
           do {
               System.out.println("Enter your choice :");
               System.out.println(" 1. Enqueue");
               System.out.println(" 2. Dequeue");
               System.out.println(" 3. Get Minimum");
               System.out.println(" 4. Display Minimum Priority Queue");
               System.out.println(" 5. Search");
               System.out.println(" 6. Exit");
               ch = scan.nextInt();

               switch (ch) {
                   case 1:
                       System.out.println("Enter the element's value to be enqueued :");
                       Object value = scan.next();
                       System.out.println("Enter the element's priority :");
                       int priority = scan.nextInt();

                       pq.enqueue(value,priority);
                       break;
                   case 2:
                       Object popped = pq.dequeue();
                       System.out.println(popped + " dequeued");
                       break;
                   case 3:
                       System.out.println("Minimum Element's value :  " + pq.getMinimum());
                       break;
                   case 4:
                       pq.display();
                       break;

                   case 5:
                       System.out.println("Enter the element's value to be searched in priority queue : ");
                       Object elem = scan.next();
                       boolean isFound = pq.search(elem);
                       String ans = (isFound)?"Element is present in Priority Queue":"Element not found in Priority Queue";
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




       } catch (EmptyPQException e){
           System.out.println(e.getMessage());
       }
    }


}
