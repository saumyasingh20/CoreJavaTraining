package june8;



import java.util.*;

public class HashMapTutorial {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(10,"Saumya");
        hm.putIfAbsent(12,"Sai");
        hm.put(10,hm.getOrDefault(10,"Shaurya")+" Singh");
        HashMap<Integer,Integer> hm2 = new HashMap<>();

        for (int i = 1;i<=10;i++){
            hm2.put(i,i*12);
        }
        for(Map.Entry<Integer,Integer> entry: hm2.entrySet()){
            System.out.println("12 x "+ entry.getKey()+" = "+entry.getValue());
        }
//        for(Map.Entry<Integer,String> entry: hm.entrySet()){
//            System.out.println(entry.getKey()+" "+entry.getValue());
//        }

    }
}
