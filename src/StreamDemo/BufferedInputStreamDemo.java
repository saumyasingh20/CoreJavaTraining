package StreamDemo;

import java.io.BufferedInputStream;

import java.io.FileInputStream;


public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("C:\\Users\\saumya.singh\\eclipse-workspace\\CoreJavaTraining\\src\\StreamDemo\\Test.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
