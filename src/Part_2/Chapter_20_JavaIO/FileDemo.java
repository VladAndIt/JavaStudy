package Part_2.Chapter_20_JavaIO;

import java.io.File;
import java.io.FileWriter;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Part_2\\Chapter_19_JavaUtils\\ScanFile3.txt");
        p("File name:" + file.getName());
        p("Path:" + file.getPath());
        p("Exact path:" + file.getAbsolutePath());
        p(file.exists() ? "exist":"does not exist!");
        p(file.canWrite() ? "is writable":"is not writable!");
        p(file.canRead() ? "is readable":"is not readable!");
        p("is " + (file.isDirectory()? "":"not" + " a directory"));
        p((file.isFile()? "is normal file":" might be a named pipe"));
        p((file.isAbsolute()? "is absolute":"is not absolute"));
        p("File last modified: " + file.lastModified());
        p("File size: " + file.length() + " Bytes");

    }

    static void p(String s) {
        System.out.println(s);
    }
}
