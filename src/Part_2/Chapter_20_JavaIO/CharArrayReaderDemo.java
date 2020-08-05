package Part_2.Chapter_20_JavaIO;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) throws IOException {
        String tmp = "hello pappy!";
        int length = tmp.length();
        char c[] = new char[length];
//        byte buf[] = tmp.getBytes();
//        char byteView[] = new char[buf.length];
//
//        for (int i = 0; i <buf.length ; i++) {
//            byteView[i] = (char) buf[i];
//            System.out.print((char)buf[i]);
//        }
        System.out.println();

        tmp.getChars(0, length, c, 0);
        int i;

        try (CharArrayReader input1 = new CharArrayReader(c)) {
            System.out.println("input1 is: ");
            while ((i = input1.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
        }
        try (CharArrayReader input2 = new CharArrayReader(c, 0 ,10)) {
            System.out.println("input2 is: ");
            while ((i = input2.read()) != -1) {
                System.out.print((char) i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
        }
    }
}
