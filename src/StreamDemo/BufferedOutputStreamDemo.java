package StreamDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamDemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\saumya.singh\\eclipse-workspace\\CoreJavaTraining\\src\\StreamDemo\\Test.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
