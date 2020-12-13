package Complete_reference_java_11.Part_2.Chapter_20_JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemo {
    public static void main(String[] args) throws IOException {
        int c;
        Vector<String> files = new Vector<String>();
        files.addElement("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile1.txt");
        files.addElement("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile2.txt");
        files.addElement("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile3.txt");

        InputStreamEnum ise = new InputStreamEnum(files);

        try (InputStream input = new SequenceInputStream(ise)){
            while ((c = input.read()) != -1) {
                System.out.println((char)c);
            }
        }
    }
}

class InputStreamEnum implements Enumeration<FileInputStream> {
    private Enumeration<String> files;

    public InputStreamEnum(Vector<String> files) {
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try(FileInputStream t = new FileInputStream(files.nextElement().toString())) {
            return t;
        } catch (IOException e) {
            return null;
        }
    }
}
