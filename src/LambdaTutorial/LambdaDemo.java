package LambdaTutorial;

public class LambdaDemo {
    public static void main(String[] args) {
//        MyInterface m = new MyInterface() {
//            @Override
//            public void display() {
//                System.out.println("printing inside");
//            }
//        };
//        m.display();
        MyInterface m = (name,marks) -> {
            System.out.println("hi i am lambda "+name+" "+marks%2);
        };
        m.display("yo",89);

    }
}
