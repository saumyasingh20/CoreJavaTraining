package day3evaluation;
import  java.util.Scanner;
public class question1 {
    // the factorial method below is used to compute the value of the factorial for a digit
    public static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter a number : ");
      int n = scan.nextInt();
      int temp = n; // temporary  variable to store the original value of n
      int sumOfDigitsFactorial = 0;
        while(n>0){
            int lastDigit = n%10;
            sumOfDigitsFactorial += factorial(lastDigit);
            n/=10;
        }
       String ans = (sumOfDigitsFactorial==temp)?""+temp:"Invalid";
        System.out.println(ans);
    }
}
