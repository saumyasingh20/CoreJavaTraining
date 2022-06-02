package june1;

public class WrapperClasses {
    public static void inc(Integer a){
        a=20;
    }
    public static void main(String[] args) {
        int a = 5;
        Integer i = 10;
        inc(i);
        System.out.println(i);
    }
}
