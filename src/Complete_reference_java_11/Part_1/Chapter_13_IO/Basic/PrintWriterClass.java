package Complete_reference_java_11.Part_1.Chapter_13_IO.Basic;

import java.io.PrintWriter;

public class PrintWriterClass {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out,true);
        pw.println("String");
        int i = 3;
        pw.println(i);
        double d = 3.5e-8;
        pw.println(d);
    }
}
