package Part_2.Chapter_20_JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        int size;

        try (FileInputStream f = new FileInputStream("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Part_2\\Chapter_19_JavaUtils\\ScanFile3.txt")) {
            System.out.println("Total Available Bytes: " + (size = f.available()));
            int n = size / 40;
            System.out.println("First " + n + " bytes of the file one read() at a time");
            System.out.print("Text: ");
            for (int i = 0; i < n; i++) {
                System.out.print((char) f.read());
            }

            System.out.println("\nStill Available: " + f.available());
            System.out.println("Reading the next " + n + " with one read(b[])");

            byte b[] = new byte[n];
            if (f.read(b) != n) {
                System.err.println("couldn't read " + n + " bytes.");
            }

            System.out.println(new String(b, 0, n));
            System.out.println("\nStill Available: " + (size = f.available()));
            System.out.println("Skipping half of remaining bytes with skip()");

            f.skip(size / 2);
            System.out.println("Still Available: " + n / 2 + " into the end of array");
            if (f.read(b, n / 2, n / 2) != n / 2) {
                System.err.println("couldn't read " + n / 2 + " bytes.");
            }
            System.out.println(new String(b, 0, b.length));
            System.out.println("\nStill Available: " + f.available());
        } catch (IOException e) {
            System.out.println("I/O Exception: " + e);
        }

    }
}
