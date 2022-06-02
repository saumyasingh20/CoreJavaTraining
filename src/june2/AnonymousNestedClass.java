package june2;

public class AnonymousNestedClass { //laptop

    void showBattery(){
        System.out.println("laptop show battery");
    }

    public static void main(String[] args) {
        AnonymousNestedClass l = new AnonymousNestedClass(){
            @Override
            void showBattery() {
                System.out.println("keypad show battery");
                super.showBattery();
            }
        };
        l.showBattery();
    }
}
