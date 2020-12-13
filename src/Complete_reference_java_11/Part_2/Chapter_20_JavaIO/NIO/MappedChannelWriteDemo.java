package Complete_reference_java_11.Part_2.Chapter_20_JavaIO.NIO;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class MappedChannelWriteDemo {
    public static void main(String[] args) throws IOException {
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile6.txt"), StandardOpenOption.READ, StandardOpenOption.WRITE, StandardOpenOption.CREATE)) {
            MappedByteBuffer mBuffer = fChan.map(FileChannel.MapMode.READ_WRITE, 0, 26);
            for (int i = 0; i < 26; i++) {
                mBuffer.put((byte) ('A' + i));
            }
        } catch (InvalidPathException e) {
            System.out.println("Path error" + e);
        }
    }
}
