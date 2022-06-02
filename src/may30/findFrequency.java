package may30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class findFrequency {
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
    public static HashMap<Integer,Integer> findFrequency(int arr[]){
        HashMap<Integer,Integer> map  = new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        return map;
    }
    public static void main(String[] args) {
        int arr[] = takeInputOfArray();
        HashMap<Integer,Integer> map = findFrequency(arr);
        System.out.println("Frequency of elements in the array is : ");

        for(HashMap.Entry<Integer, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+" - " + entry.getValue());
        }

    }
}
