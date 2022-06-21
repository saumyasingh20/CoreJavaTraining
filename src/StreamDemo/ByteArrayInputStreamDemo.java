package StreamDemo;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        try{
            byte[] b = "Hey ! Testing Byte Array Input Stream".getBytes();
            ByteArrayInputStream bais = new ByteArrayInputStream(b);

            System.out.println("available " + bais.available());
            System.out.println("First character "+ (char)bais.read());
            System.out.println("available " + bais.available());
            bais.readNBytes(3);
            System.out.println("available " + bais.available());
            bais.mark(5);
            System.out.println("fifth "+(char)bais.read());
            System.out.println("sixth"+(char)bais.read());
            bais.reset();
            System.out.println("seventh "+(char)bais.read());
            System.out.println("eighth "+(char)bais.read());
//            byte[] op = bais.readAllBytes();
//
//            for(byte bb:op){
//                System.out.print((char)bb);
//            }
//            System.out.println();
            System.out.println("available " + bais.available()); // returns the number of remaining bytes to be read
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
