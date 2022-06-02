package may23;

import java.util.Scanner;

public class test3 {
    public static  boolean checkPrime(int n){
        boolean ans = true;
        for(int i =2;i<Math.sqrt(n);i++){
            if (n%i==0){
                ans = false;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter value of n ");
        int n= scan.nextInt();
        System.out.println("Prime numbers till "+n+" are : ");
        for(int i = 2;i<n;i++){
            if(checkPrime(i)){
                System.out.print(i+" ");
            }

        }


    }
}
