package Complete_reference_java_11.Part_2.Chapter_20_JavaIO.NIO;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class DirTreeListDemo {
    public static void main(String[] args) throws IOException {
        String dirname = "D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_20_JavaIO";
        System.out.println("Directory tree starting with " + dirname + "\n");


        SimpleFileVisitor<Path> filter = new SimpleFileVisitor<Path>() { //anonymous class with filter
            public FileVisitResult visitFile(Path path, BasicFileAttributes attributes) {
                if (attributes.isRegularFile()) System.out.println("Change time: " + attributes.lastModifiedTime());

                System.out.println(path);
                return FileVisitResult.CONTINUE;
            }
        };
        try {
            //Files.walkFileTree(Path.of(dirname), new MyFileVisitor());
            Files.walkFileTree(Path.of(dirname), filter);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

//class MyFileVisitor extends SimpleFileVisitor<Path> { ------------------> turned into anonymous class up!
//    public FileVisitResult visitFile(Path path, BasicFileAttributes attributes) {
//        System.out.println(path);
//        return FileVisitResult.CONTINUE;
//    }
//}
