package Part_2.Chapter_20_JavaIO.NIO;

import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InputStreamNIO {
    public static void main(String[] args) throws IOException {
        int i;
        try (InputStream fin = Files.newInputStream(Paths.get("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Part_2\\Chapter_20_JavaIO\\Sfile6.txt"))){
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != -1);
        }
    }
}
