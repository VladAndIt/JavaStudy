package Complete_reference_java_11.Part_2.Chapter_20_JavaIO.NIO;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ExplicitChannelReadDemo {
    public static void main(String[] args) throws IOException {
        int count;
//        Path filepath = null;

//        try {
//            filepath = Paths.get("Sfile1.txt");
//        } catch (InvalidPathException e) {
//            System.out.println("Path Error " + e);
//            return;
//        }
        try (FileChannel fChan = (FileChannel) Files.newByteChannel(Paths.get("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile2.txt"))) {
            long fSize = fChan.size();
            MappedByteBuffer mBuf = fChan.map(FileChannel.MapMode.READ_ONLY, 0, fSize);
            for (int i = 0; i < fSize; i++) {
                System.out.print((char)mBuf.get());
            }
            System.out.println();
        }
        try (SeekableByteChannel fChan = Files.newByteChannel(Paths.get("Sfile1.txt"))){
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do {
                count = fChan.read(mBuf);
                if (count != -1) {
                    mBuf.rewind();
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) mBuf.get());
                    }
                }
            } while (count != -1);
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
        }
    }
}
