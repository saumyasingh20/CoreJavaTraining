package june2;
//member nested class
public class Laptop {
   int modelNo = 98877;
    class Keypad{
         void pressKeypad(){
             System.out.println("key is pressed"+modelNo);
        }

        class  KeyA {
             void keyInfo(){
                 System.out.println("a is pressed");
             }
        }
    }

    public static void main(String[] args) {
        Laptop l = new Laptop();
        Laptop.Keypad k = l.new Keypad();
        k.pressKeypad();
        System.out.println(l.modelNo);

        Keypad.KeyA a = k.new KeyA();
        a.keyInfo();
    }
}
