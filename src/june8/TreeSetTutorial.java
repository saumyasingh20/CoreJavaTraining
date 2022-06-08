package june8;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTutorial {
    public static void main(String[] args) {
        TreeSet<Integer> hs = new TreeSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(20);
        hs.add(76);
        hs.add(42);
        hs.add(89);
        hs.add(67);
        hs.add(33);
//        hs.removeIf(a->a%2==0);
        System.out.println(hs.headSet(50)); //elements smaller than 50 in sorted order
        System.out.println(hs.tailSet(50)); //elements greater than 50 in sorted order
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next() +" ");
        }
    }
}
