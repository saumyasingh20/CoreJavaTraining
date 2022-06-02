package may26;

class Student{
    int id;
    String name;
    final String college = "wont tell" ;

}
//class Coder extends  Student{ java: cannot inherit from final may26.Student
//    public void display(){
//        super();
//    }
//}
public class finalKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.id = 18;
        s1.name="saumya";
//        s1.college="iit"; java: cannot assign a value to final variable college
//        Coder c = new Coder();
//        c.display();
    }
}
