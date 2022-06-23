package may24;
class Animal1{
    int numOfLegs;

    public Animal1() {
        System.out.println("animal");
    }
    public void display(){
        System.out.println("animal display");
    }

}
class Dog1 extends Animal1{
    public Dog1() {
        System.out.println("dog");
    }
    public void display(){
        System.out.println("dog display");
    }
}
class Labra extends Dog1{
    public Labra() {
        System.out.println("labra");
    }
    public void display(){
        System.out.println("labra display");
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
       // Labra l = new Labra();
        Animal1 a = new Animal1();
        a.display();
    }
}
