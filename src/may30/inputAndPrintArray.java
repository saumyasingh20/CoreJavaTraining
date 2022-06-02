package may30;

import java.util.Scanner;

public class inputAndPrintArray {
    public  static  void printArray(int arr[]){
        for(int i : arr){
            System.out.print(i+" ");
        }
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
        int arr[]= takeInputOfArray();
        printArray(arr);
//        System.out.println(arr);
    }
}
