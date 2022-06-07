package june7;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorTutorial {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        for(int i = 10;i<=50;i+=10){
            v.add(i);
        }
        Iterator it = v.iterator();
        for (int i: v){
            System.out.print(i+" ");
        }
        v.addElement(60);
        System.out.println();
//        v.forEach(i -> System.out.print(i+" "));
//        System.out.println();
//        Collections.sort(v,Collections.reverseOrder());
//        v.forEach(i-> System.out.print(i+" "));
        ListIterator<Integer> li = v.listIterator(v.size());
        while (li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
    }
}
