package Part_2.Chapter_20_JavaIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        try (FileReader fr = new FileReader("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Part_2\\Chapter_20_JavaIO\\Sfile1.txt")) {
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
