package Part_2.Chapter_20_JavaIO;

import java.io.*;

public class PushBackReaderDemo {
    public static void main(String[] args) {
        String s = "if (a == 4) a = 0;\n";
//        byte buffer[] = s.getBytes();
        char buffer[] = new char[s.length()];

        s.getChars(0,s.length(),buffer,0);

        CharArrayReader in = new CharArrayReader(buffer);
        int c;
        try (PushbackReader f = new PushbackReader(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '=':
                        if ((c = f.read()) == '=') System.out.print(".eq.");
                        else {
                            System.out.print("<-");
                            f.unread(c);
                        }
                        break;
                    default:
                        System.out.print((char) c);
                }
            }
        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
        }
    }
}
