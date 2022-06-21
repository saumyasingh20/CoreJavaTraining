package StreamDemo;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        try{
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write("hello i am byte array".getBytes());
            byte[] b = baos.toByteArray();
            FileOutputStream fos = new FileOutputStream("C:\\Users\\saumya.singh\\eclipse-workspace\\CoreJavaTraining\\src\\StreamDemo\\Test.txt");
            baos.writeTo(fos);
            fos.write(b);
            System.out.println("printed");
            baos.flush();
            fos.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
