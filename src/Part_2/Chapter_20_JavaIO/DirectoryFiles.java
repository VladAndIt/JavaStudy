package Part_2.Chapter_20_JavaIO;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoryFiles {
    public static void main(String[] args) {
        String dirname = "D:\\Oracle\\Projects\\JAVA_Schildt";
        File f1 = new File(dirname);


        FilenameFilter only = new OnlyExt("iml");
        String s1[] = f1.list(only);
        for (int i = 0; i < s1.length; i++) {
                System.out.print(s1[i] + " ");
        }

        System.out.println();

        if (f1.isDirectory()) {
            System.out.println("Directory of " + dirname);
            String s[] = f1.list();

            for (int i = 0; i < s.length; i++) {
                File f = new File(dirname + "\\" + s[i]);
                if (f.isDirectory()) {
                    System.out.println(s[i] + " is a directory!");
                }else System.out.println(s[i] + " is a file!");
            }
        }else System.out.println(dirname + " is not a directory!");


    }

}

class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}
