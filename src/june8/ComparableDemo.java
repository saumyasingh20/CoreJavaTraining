package june8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student implements  Comparable<Student>{
    int id;
    String name;
    int marks;

    public Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return this.id + " " + this.marks+ " " + this.name;
    }

       @Override
    public int compareTo(Student o) {
        if(this.marks>o.marks)
            return 1;
        else if(this.marks<o.marks)
            return -1;
        else
            return 0;
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        Student s1 = new Student(1,"saum",87);
        Student s2 = new Student(2,"shre",98);
        Student s3 = new Student(3,"sai",77);
        Student s4 = new Student(4,"hari",78);

        ArrayList<Student> arr = new ArrayList<>();
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
        Collections.sort(arr,Collections.reverseOrder());

        Iterator it = arr.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
//        for (Student s : arr){
//            System.out.println(s.id+" "+ s.marks+" "+ s.name);
//        }

    }

}
