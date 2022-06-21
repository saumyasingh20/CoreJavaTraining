package StreamDemo;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo {
    public static void main(String[] args) {
       try{
           FileInputStream fis = new FileInputStream("C:\\Users\\saumya.singh\\eclipse-workspace\\CoreJavaTraining\\src\\StreamDemo\\Test.txt");
           DataInputStream dis = new DataInputStream(fis);

           byte arr[]=dis.readAllBytes();
           for(byte b : arr){
               System.out.print((char)b);
           }
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
    }
}
