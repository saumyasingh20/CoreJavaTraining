package june1;

public class test {
    public static int xyz(int a, int b){
        return (a/b);
    }
    public static void main(String[] args) {
    try{
        System.out.println(xyz(5,0));
    }catch (ArithmeticException e){
        System.out.println("You have an exception in your program because: "+e.getMessage() );
    }

    }
}
