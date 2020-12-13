package Complete_reference_java_11.Part_2.Chapter_20_JavaIO;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException{
        String s = "This is a &copy2; copyright symbol but this is &copy not.\n";
        char buffer[] = new char[s.length()];
        s.getChars(0,s.length(),buffer,0);
//        byte buf[] = s.getBytes();
//        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        CharArrayReader in = new CharArrayReader(buffer);
        int c;
        boolean marked = false;

        try(BufferedReader f = new BufferedReader(in)) {
            while ((c = f.read()) != -1) {
                switch (c) {
                    case '&':
                        if (!marked) {
                            f.mark(32);
                            marked = true;
                        } else marked = false;
                        break;
                    case ';':
                        if (marked) {
                            marked = false;
                            System.out.print("(c)");
                        } else System.out.print((char) c);
                        break;
                    case ' ':
                        if (marked) {
                            marked = false;
                            f.reset();//iteration with a marked point
                            System.out.print("&");
                        }else System.out.print((char )c);
                        break;
                    default:
                        if (!marked) {
                            System.out.print((char) c);
                        }
                        break;
                }
            }
        } catch (IOException e) {
            System.out.println("I/O Exception " + e);
        }
    }
}
