package Complete_reference_java_11.Part_2.Chapter_20_JavaIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        String source = "In to am attended desirous raptures declared diverted confined at. " +
                "Collected instantly remaining up certainly to necessary as" +
                "ase left use. Match round scale now sex style far times. Your me past an much.";
        byte buf[] = source.getBytes();
        char buffer[] = new char[source.length()];
        source.getChars(0,source.length(),buffer,0);


        try (FileWriter f1 = new FileWriter("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile1.txt");
             FileWriter f2 = new FileWriter("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile2.txt");
             FileWriter f3 = new FileWriter("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile3.txt"))
        {
            for (int i = 0; i < buffer.length; i += 2) {
                f1.write(buffer[i]);
            }
            f2.write(buffer);
            f3.write(buffer, buffer.length - buffer.length / 4, buffer.length / 4);
        } catch (IOException e) {
            System.out.println("An I/O Exception Occurred" + e);
        }
    }
}
