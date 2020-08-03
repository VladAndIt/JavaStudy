package Part_2.Chapter_19_JavaUtils;

import java.io.*;
import java.util.Scanner;

public class ScannerFileReader {
    public static void main(String[] args) throws IOException {
        String fileContent = "Example";
//        Scanner sinput = new Scanner(fileContent);
//        System.out.println(sinput);

        Scanner input = new Scanner(System.in);
        while (input.hasNextInt())System.out.println(input.nextInt());


        FileReader file1 = new FileReader("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Part_2\\Chapter_19_JavaUtils\\ScanFile.txt");
        Scanner src = new Scanner(file1);

    }
}
