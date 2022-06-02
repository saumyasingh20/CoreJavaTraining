package may31;

import java.util.Scanner;

public class factorialRecursion {
    public static int factorial(int n){
        if(n==0 || n==1)
            return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find out its factorial");
        int n = scan.nextInt();
        System.out.println("Factorial of "+n+" is "+factorial(n));
    }
}
