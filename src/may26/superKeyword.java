package may26;
class Person{
    public void display(){
        System.out.println("hello");
    }
}
class Employee2 extends Person{
    public void display2(){
        System.out.println("bye");
        display(); //no need of super keyword here
    }
}
public class superKeyword {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2();
//        e1.display();
        e1.display2();
    }
}
