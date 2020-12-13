package Complete_reference_java_11.Part_1.Chapter_13_IO.FileIO;

import java.io.*;

public class FileReader {
    public static void main(String[] args) throws IOException {
        String fileContent = "";

//        FileInputStream file1 = new FileInputStream("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_1.Chapter_13_IO\\FileIO\\FirstFile.txt");
  //      FileOutputStream file2 = new FileOutputStream("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_1.Chapter_13_IO\\FileIO\\SecondFile.txt");

    //    BufferedInputStreamDemo bufferedInputStream = new BufferedInputStreamDemo(file1 ,200);
        int i;

        try (
                FileOutputStream file2 = new FileOutputStream("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_1.Chapter_13_IO\\FileIO\\SecondFile.txt");
                BufferedInputStream bufferedInputStream =
                new BufferedInputStream(new FileInputStream("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_1.Chapter_13_IO\\FileIO\\FirstFile.txt") ,200))
        {
//            file1 = new FileInputStream("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_1.Chapter_13_IO\\FileIO\\FirstFile.txt");
            do {
                i = bufferedInputStream .read();
                if (i!=-1){
                    fileContent += (char)i;
                    file2.write(i);
                }
            }while (i != -1);
            System.out.println(fileContent);
        }catch (IOException e){
            System.out.println("Error of reading");
        }
//        finally {
//            file2.close();
//        }
    }
}
