package may30;

import java.util.Arrays;
import java.util.Scanner;

public class printArrayDescending {
    public static int findMax(int arr[],int si, int ei){
        int max = Integer.MIN_VALUE;
        for(int i = si;i<ei;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return  max;
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
        int arr[] = takeInputOfArray();
        for(int i = 0;i<arr.length;i++){
            System.out.println(Math.max(findMax(arr,0,i-1),findMax(arr,i,arr.length)));
        }


    }
}
