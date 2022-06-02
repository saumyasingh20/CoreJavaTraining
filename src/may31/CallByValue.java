package may31;

public class CallByValue {
    int id;
    public static void modifyString(String str){
        str="";
    }
    public static void abc(int[] arr){
        arr[1]=10;
    }
     public static void inc(CallByValue abc){
        abc.id=20;
    }
    public static void main(String[] args) {
        CallByValue s = new CallByValue();
        s.id=12;
        inc(s);
//        System.out.println(s.id);
        int arr[] = {4,0,9,1,5};
        abc(arr);
//        for(int i:arr){
//            System.out.print(i+" ");
//        }
        String str = "saumya";
//
          modifyString(str);
        System.out.println(str);

    }
}
