package may31;

import java.util.Scanner;

public class Print1toNRecursive {
    public static void print1toN(int n){
       if(n>=1){
           print1toN(n-1);
           System.out.print(n+" ");
       }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n - ");
        int n = scan.nextInt();
        print1toN(n);
    }
}
