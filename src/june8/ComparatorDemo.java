package june8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer {
    int id;
    String name;
    int score;

    public Cricketer(int id, String name, int score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return this.id+" "+ this.name+" "+ this.score;
    }
}
class  CompareByScore implements Comparator<Cricketer>{
    public int compare(Cricketer o1, Cricketer o2) {
        if(o1.score<o2.score)
            return 1;
        else  if(o1.score>o2.score)
            return -1;
        else
            return 0;
    }
}
class  CompareByID implements Comparator<Cricketer>{
    public int compare(Cricketer o1, Cricketer o2) {
        if(o1.id>o2.id)
            return 1;
        else  if(o1.id<o2.id)
            return -1;
        else
            return 0;
    }
}
public class ComparatorDemo {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer(1,"kohli",10000);
        Cricketer c2 = new Cricketer(2,"rohit",76867);
        Cricketer c3 = new Cricketer(3,"ABD",89787);
        Cricketer c4 = new Cricketer(4,"warner",24324);
        Cricketer c5 = new Cricketer(5,"Maxwell",67546);
        ArrayList<Cricketer> arr = new ArrayList<>();
        arr.add(c1);
        arr.add(c2);
        arr.add(c3);
        arr.add(c4);
        arr.add(c5);
//        Collections.sort(arr,new CompareByScore());
        Collections.sort(arr,new CompareByID());
        for (Cricketer c : arr){
            System.out.println(c);
        }
    }

}
