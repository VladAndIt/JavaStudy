package Complete_reference_java_11.Part_2.Chapter_19_JavaUtils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScanerDelimeter {
    public static void main(String[] args) throws IOException {


        FileWriter file3 = new FileWriter("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_19_JavaUtils\\ScanFile3.txt");
        file3.write("2*2 *2 , 4 ,21 ,3,4,4");
        file3.close();

        FileReader file3R = new FileReader("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Complete_reference_java_11.Part_2\\Chapter_19_JavaUtils\\ScanFile3.txt");

        Scanner scr = new Scanner(file3R);
        scr.useDelimiter(", *");
            while (scr.hasNext()) {
                System.out.println(scr.next());
            }
    }
}


