package june3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTutorial {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(8);
        arr.add(2,87);
//        arr.remove(2);

        Collections.sort(arr); //ascending order
        Collections.sort(arr,Collections.reverseOrder()); //descending order

        arr.remove(Integer.valueOf(5));
        if(arr.contains(5)){
            System.out.println("5 is present ");
        }else {
            System.out.println("5 is not present");
        }

       Object b[]= arr.toArray(new Object[arr.size()]);

//        Object b[] = arr.toArray();
        for(Object i : arr){
            System.out.println(i);
        }
        Integer a = Integer.valueOf(5);
//        Object b = (Object)a;
        System.out.println(" b "+b);
        arr.set(0,888);
       int first= arr.get(0);
        System.out.println(arr);
        //printing an array list through iterator
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println(arr);

        //forEach loop
       // arr.forEach(i -> System.out.println(i+10));
        arr.forEach(i -> System.out.println(i));
    }
}
