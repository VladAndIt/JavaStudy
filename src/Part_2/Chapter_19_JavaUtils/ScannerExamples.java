package Part_2.Chapter_19_JavaUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) throws IOException {
        Scanner conin2 = new Scanner(System.in);
        int count = 0;
        double sum = 0.0;

        System.out.println("Enter number vis keyboard for calculate the average value!");


        while (conin2.hasNext()) {
            if (conin2.hasNextDouble()) {
                sum += conin2.nextDouble();
                count++;
            }
            else {
                String str = conin2.next();
                if (str.equals("Final")) break;
                else {
                    System.out.println("Error of format data!");
                    return;
                }
            }
        }
        conin2.close();
        System.out.println("Average of number is " + sum/count);

        //FILE READING

        int countFile = 0;
        double sumFile = 0.0;

        FileWriter file3 = new FileWriter("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Part_2\\Chapter_19_JavaUtils\\ScanFile3.txt");
        file3.write("2 3,5 4 6 3,5 3,3 Final");
        file3.close();

        FileReader file3R = new FileReader("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Part_2\\Chapter_19_JavaUtils\\ScanFile3.txt");
        try(Scanner scr = new Scanner(file3R)) {
            while (scr.hasNext()) {
                if (scr.hasNextDouble()) {
                    sumFile += scr.nextDouble();
                    countFile++;
                }
                else {
                    String str = scr.next();
                    if (str.equals("Final")) break;
                    else {
                        System.out.println("Error of format data!");
                        return;
                    }
                }
            }
            System.out.println("File average value is " + sumFile/countFile);
        }


        //Scan all

        int i2;
        double d = 0;
        boolean b;
        String str = "";

        FileReader file2R = new FileReader("D:\\Oracle\\Projects\\JAVA_Schildt\\src\\Part_2\\Chapter_19_JavaUtils\\ScanFile.txt");

        try(Scanner scr = new Scanner(file2R)) {
            while (scr.hasNext()) {
                if (scr.hasNextInt()) {
                    i2 = scr.nextInt();
                    System.out.println("Integer: " + i2);
                }
                else if (scr.hasNextDouble()) {
                    d = scr.nextDouble();
                    System.out.println("Double: " + d);
                }
                else if (scr.hasNextBoolean()) {
                    b = scr.nextBoolean();
                    System.out.println("Boolean: " + b);
                }
                else {
                    String str2 = scr.next();
                    System.out.println("String: " + str2);
                }
            }
            System.out.println("File average value is " + sumFile/countFile);
        }

//        Scanner src = new Scanner(file3);



    }
}
