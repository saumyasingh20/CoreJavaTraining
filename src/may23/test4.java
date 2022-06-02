package may23;
import java.util.Scanner;
public class test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int low = scan.nextInt();
        int high = scan.nextInt();
        for(int i = low,j= high-1; i<high && j>low;i+=2,j-=2){
            System.out.print(i +" "+j+ " ");
        }


    }
}
