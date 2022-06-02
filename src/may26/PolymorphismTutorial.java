package may26;
class Animal{
    public void display(){
        System.out.println("Animal class called");
    }
}
class Dog extends Animal{
    public void display(){
        System.out.println("dog class called");
    }
}
public class PolymorphismTutorial {
    public static void main(String[] args) {
        Dog d = new Dog();
//        d.display();
        Animal a = new Animal();
//        a.display();
//        Animal b = new Dog();
//        b.display();
    }
}
