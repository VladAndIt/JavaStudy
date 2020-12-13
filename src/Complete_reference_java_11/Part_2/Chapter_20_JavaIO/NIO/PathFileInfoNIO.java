package Complete_reference_java_11.Part_2.Chapter_20_JavaIO.NIO;

import javax.imageio.IIOException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class PathFileInfoNIO {
    public static void main(String[] args) throws IOException {
        Path filepath = Path.of("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile6.txt");

        System.out.println("FileName: " + filepath.getName(6) +
                "\nPath: " + filepath +
                "\nAbsolute Path: " + filepath.getParent());
        if (Files.exists(filepath)) System.out.println("File exists");
        else System.out.println("File doesn't exist");

        try {
            if (Files.isHidden(filepath)) System.out.println("File is hidden");
            else System.out.println("File isn't hidden");
        } catch (IIOException e) {
            System.out.println("Error " + e);
        }

        Files.isWritable(filepath);
        System.out.println("File is writable");

        Files.isReadable(filepath);
        System.out.println("File is readable");

        try {
            BasicFileAttributes FileAttributes = Files.readAttributes(filepath, BasicFileAttributes.class);
            if (FileAttributes.isDirectory()) System.out.println("The file is a directory");
            else System.out.println("File isn't a directory");

            if (FileAttributes.isRegularFile()) System.out.println("The file is a normal file");
            else System.out.println("The file isn't a normal file");
            if (FileAttributes.isSymbolicLink()) System.out.println("The file is a symbol link");
            else System.out.println("File isn't a symbol link");

            System.out.println("File last modified: " + FileAttributes.lastModifiedTime() +
                    "\nFile size: " + FileAttributes.size() + " Bytes");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
