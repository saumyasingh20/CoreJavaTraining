package may23;

import java.util.Scanner;

//this class checks if a number is ar or not
public class test2 {
    public static void main(String[] args){
        System.out.println("Enter the value of n");
        Scanner scan =new Scanner(System.in);
        int n= scan.nextInt();
        int k = 0;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                if(k==n)
                    return;
                System.out.print(++k);


            }

            System.out.println();
        }
    }
}
