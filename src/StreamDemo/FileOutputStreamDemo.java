package StreamDemo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("C:\\Users\\saumya.singh\\eclipse-workspace\\CoreJavaTraining\\src\\StreamDemo\\Test.txt");
        fos.write(65);
        fos.write(66);
        fos.write("\nMy name is Saumya Singh".getBytes());
        fos.write("\nMy name is Saumya Singh".getBytes(),3,15);
        System.out.println("printed");
        fos.close();

    }
}
