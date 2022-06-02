package may23;

import java.util.Scanner;
public class test1 {
    public static boolean checkArmstrong(int n){
        boolean ans = false;
        int temp=n;
        int sum=0;
        while(n>0)
        {
            int lastDigit=n%10;
            sum+=lastDigit*lastDigit*lastDigit;
            n/=10;
        }
        if(sum==temp){
            ans = true;
        }
        return ans;


    }
    public static void main(String[] args) {

                Scanner scan =new Scanner(System.in);
                System.out.println("Enter a number to check if it is armstrong or not :");
                int n= scan.nextInt();
                boolean ans = checkArmstrong(n);
                if(ans)
                    System.out.println(n+"is an Armstrong number");
                else
                    System.out.println(n+"is not an Armstrong number");


    }
}
