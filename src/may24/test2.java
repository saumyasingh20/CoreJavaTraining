package may24;
import  java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res2 = n*2;
        int res3 = n*3;
//        if(res2+res5 !=1000){
//            System.out.println("number is "+n+"result is "+(res2+res5));
//        }else
//            System.out.println("invalid");
        String ans = (res2 + res3 != 1000) ? ""+n : "invalid";
        System.out.println(ans);

    }
}
