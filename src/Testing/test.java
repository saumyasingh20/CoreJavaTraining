package Testing;

import java.util.Scanner;

public class test {
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
        try{
            int arr[]=takeInputOfArray();
            int largest = findLargest(arr);
            System.out.println(largest);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static int findLargest(int[] arr) {
        if(arr.length<=0){
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max= arr[i];
            }
        }
        return max;
    }
}
