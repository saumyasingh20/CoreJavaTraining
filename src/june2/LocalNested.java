package june2;

public class LocalNested {
    void xyz(){
        class Inner{
            void abc(){
                System.out.println("inside abc");
            }
        }
        Inner i = new Inner();
        i.abc();
    }
    public static void main(String[] args) {
        LocalNested l = new LocalNested();
        l.xyz();
    }
}
