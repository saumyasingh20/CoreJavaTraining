package may31;

import java.util.Scanner;

public class question1 {
    //    private static int calculateFrequentInteger(int[] arr) {
//        int mostFrequent = Integer.MIN_VALUE;
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i:arr){
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
//        for(int i:arr){
//            if(map.get(i)>mostFrequent){
//                mostFrequent=i;
//            }
//        }
//        return mostFrequent;
//    }
    public static int mostFrequent(int[] arr) {
        int ans = Integer.MIN_VALUE ;
        int maxCount = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length;i++){
            int count = 1;
            for(int j = i+1; j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(maxCount<count){
                maxCount=count;
                if(maxCount>=(arr.length/2)){
                    ans = arr[i];
                }
            }
        }
        return ans;

    }
    public static int[] takeInputOfArray(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = scan.nextInt();
        System.out.println("Enter "+n+" integers : ");
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]=takeInputOfArray();
        int mostFrequentInteger = mostFrequent(arr);
        String ans = (mostFrequentInteger!=Integer.MIN_VALUE)?""+mostFrequentInteger:"Not found";
        System.out.println(ans);

    }


}

