package Complete_reference_java_11.Part_2.Chapter_20_JavaIO.NIO;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.Files.newDirectoryStream;

public class DirectoryList {

    public static void main(String[] args) throws IOException {
        String dirname = "D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO";

//        try (DirectoryStream<Path> dirSname = Files.newDirectoryStream(Path.of(dirname), "*.{txt,class,java}")) {// wildcard glob parameters for NIO

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>(){ // That's an MARK anonymous class!
            @Override
            public boolean accept(Path entry) throws IOException {
                if (Files.isWritable(entry)) return true;
//                if (Files.isDirectory(entry)) return true;
                return false;
            }
        };
        try (DirectoryStream<Path> dirSname = Files.newDirectoryStream(Path.of(dirname), how)) {// FILTER NIO FOR DIRECTORY AND FILES
            System.out.println("Directory: " + dirname);

            for (Path entry : dirSname) {
                BasicFileAttributes attributes = Files.readAttributes(entry, BasicFileAttributes.class);
                if (attributes.isDirectory()) System.out.println("<DIR> ");
                else System.out.println("      ");
                System.out.println(entry.getFileName());
            }
        }
    }
}
