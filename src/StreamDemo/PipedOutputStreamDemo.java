package StreamDemo;

import java.io.PipedOutputStream;

public class PipedOutputStreamDemo {
    //it can only read input from piped input stream not from output stream
    public static void main(String[] args) {
        PipedOutputStream pos = new PipedOutputStream();
    }
}
