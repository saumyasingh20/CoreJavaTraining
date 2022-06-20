package StreamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\saumya.singh\\eclipse-workspace\\CoreJavaTraining\\src\\StreamDemo\\Test.txt");

//        byte[] file = fis.readAllBytes();
//        for(byte b:file){
//            System.out.print((char) b);
//        }
//        System.out.println();
        byte[] file2 = fis.readNBytes(10);
        for (byte b :file2){
            System.out.print((char) b);
        }
//        System.out.println((char) fis.read());
//        int x = 0;
//        while ((x= fis.read())!=-1){
//            System.out.print((char)x);
//        }
        fis.close();
    }
}
