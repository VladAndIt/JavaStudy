package Part_2.Chapter_20_JavaIO.NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelWritingDemo {
    public static void main(String[] args) throws IOException {
        int count;
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Part_2\\Chapter_20_JavaIO\\Sfile2.txt"),StandardOpenOption.WRITE,StandardOpenOption.CREATE)) {
            ByteBuffer mBuf = ByteBuffer.allocate(26);
            for (int j =0;j<3;j++) {
                for (int i = 0; i < 26; i++) {
                    mBuf.put((byte)('a' + i));
                }
                mBuf.rewind();
                fChan.write(mBuf);
                mBuf.rewind();
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
        }
    }
}
