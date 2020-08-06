package Part_2.Chapter_20_JavaIO.NIO;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        int count;
        try (SeekableByteChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Part_2\\Chapter_20_JavaIO\\Sfile2.txt"))) {
            ByteBuffer mBuf = ByteBuffer.allocate(12);
            char buffer[] = new char[12];
            do {
                count = fChan.read(mBuf);
                if (count != -1) {
                    mBuf.rewind();
                    for (int i = 0; i <count ; i++) {
                        System.out.print((char)mBuf.get());
                    }
                }
            } while (count != -1);
        }
    }
}
