package Complete_reference_java_11.Part_2.Chapter_20_JavaIO.NIO;

import javax.imageio.IIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyFileDemo {
    public static void main(String[] args) throws IIOException {
        try {
            Path target = Paths.get("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile5.txt");
//            Path source = Paths.get("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile6.txt");

            Files.copy(Paths.get("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO\\Sfile6.txt"), target, StandardCopyOption.REPLACE_EXISTING);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
