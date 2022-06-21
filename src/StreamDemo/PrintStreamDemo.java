package StreamDemo;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamDemo {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream ps = new PrintStream("C:\\Users\\saumya.singh\\eclipse-workspace\\CoreJavaTraining\\src\\StreamDemo\\Test.txt");
        ps.print("hey testing print stream");
        ps.println();
        ps.println(78);
        ps.println(new char[]{'s','a','u','m','y'});
        ps.println(3455456);
        ps.println(true);
        ps.format("%d %d %s hey %c testing format",87,98,"hello",'S');
    }
}
