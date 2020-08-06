package Part_2.Chapter_20_JavaIO.NIO;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BufferedInputStreamNIO {
    public static void main(String[] args) throws IOException {
        int i;
        try (OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Part_2\\Chapter_20_JavaIO\\Sfile6.txt")))) {
            for (int j = 0; j < 28; j++) {
                fout.write((byte) ('0' + j));
            }
        }
    }
}
