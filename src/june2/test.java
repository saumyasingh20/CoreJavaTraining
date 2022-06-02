package june2;
//interface inside interface , implementing inner
public class test implements Old.newInterface{

    public void abc() {
        System.out.println("abc");
    }

    public static void main(String[] args) {
        test t = new test();
        t.abc();
    }
}
