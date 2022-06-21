package StreamDemo;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) {
       try{
           FileOutputStream fos = new FileOutputStream("C:\\Users\\saumya.singh\\eclipse-workspace\\CoreJavaTraining\\src\\StreamDemo\\Test.txt");

           ObjectOutputStream oos = new ObjectOutputStream(fos);
       }
       catch (Exception e){
           System.out.println(e.getMessage());
       }
    }

}
