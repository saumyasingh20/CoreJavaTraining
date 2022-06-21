package StreamDemo;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataOutputStreamDemo {
    public static void main(String[] args) {
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\saumya.singh\\eclipse-workspace\\CoreJavaTraining\\src\\StreamDemo\\Test.txt");

            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeDouble(40);
            dos.writeBoolean(false);
            dos.writeChar(43);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
