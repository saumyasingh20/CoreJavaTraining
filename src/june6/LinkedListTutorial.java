package june6;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTutorial {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(5);
        ll.add(0,12);
        ll.add(10);
        ll.add(87);
        ll.set(2,98);
//        ll.remove(Integer.valueOf(10));
//        ll.remove(0);
        System.out.println(ll.size());
        System.out.println(ll);
        System.out.println(ll.contains(9));

        for (int i = 0; i < ll.size(); i++) {
             ll.set(i,ll.get(i)+10);
        }


        Iterator it = ll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        Iterator reverseIt = ll.descendingIterator();
//        while (reverseIt.hasNext()){
//            System.out.println(reverseIt.next());
//        }
        System.out.println(ll.peek());


    }
}
