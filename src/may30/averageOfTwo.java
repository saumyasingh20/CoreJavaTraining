package may30;

import java.util.Scanner;

public class averageOfTwo {
    public static  double average(int a , int b){
        return (double)(a+b)/2;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int a = scan.nextInt(),b = scan.nextInt();
        System.out.println(average(a,b));

    }
}
