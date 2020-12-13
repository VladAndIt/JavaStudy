package Complete_reference_java_11.Part_2.Chapter_20_JavaIO;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ChatArrayWriterDemo {
    public static void main(String[] args) throws IOException {
        CharArrayWriter f = new CharArrayWriter();
        String s = "This should end up in the array!";
        char buf[] = new char[s.length()];

        s.getChars(0, s.length(), buf, 0);
        try {
            f.write(buf);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("Into Array");

        char c[] = f.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i]);
        }

        System.out.println("\nTo a FileWriter");
        try (FileWriter f2 = new FileWriter("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile1.txt")) {
            f.writeTo(f2);
        } catch (IOException e) {
            System.out.println("I/O Exception: " + e);
        }

        System.out.println("Doing a reset");
        f.reset();

        for (int i = 0; i < 3; i++) f.write('X');
        System.out.println(f.toString());

    }
}
