package june8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTutorial {
    //preserves the insertion order
    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(20);
        hs.add(89);
        hs.add(67);
        hs.add(33);
//        hs.removeIf(a->a%2==0);

        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.print(it.next() +" ");
        }
    }
}
