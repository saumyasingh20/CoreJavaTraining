package may30;

import java.util.Scanner;

public class averageOfArray {
    public static double avg(int arr[]){
        double sum=0;
        for(int i :arr){
            sum+=i;
        }
//        double averageArr = (double) sum/arr.length;
        return (double) sum/arr.length;
    }

    public static int[] takeInputOfArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+n+" integers");

        for(int i = 0;i<n;i++){
            arr[i] = scan.nextInt();
        }

        return arr;

    }

    public static void main(String[] args) {
        int arr[]=takeInputOfArray();
        System.out.println(avg(arr));
    }
}
