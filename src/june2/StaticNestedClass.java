package june2;




//member nested class
public class StaticNestedClass {
    static int modelNo = 98877;
    static class Keypad{
        void pressKeypad(){
            System.out.println("key is pressed"+modelNo);
        }


    }

    public static void main(String[] args) {
        StaticNestedClass l = new StaticNestedClass();
        StaticNestedClass.Keypad k = new StaticNestedClass.Keypad();
        k.pressKeypad();
        System.out.println(l.modelNo);

    }
}
