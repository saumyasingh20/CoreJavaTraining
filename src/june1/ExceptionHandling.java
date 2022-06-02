package june1;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) throws ArithmeticException{
        try{
            String s = null;
            System.out.println(s.length());
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            if(n<0){
                throw new ArithmeticException("Number cant be lesser than 0");
            }
            System.out.println(n);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
