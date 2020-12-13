package Complete_reference_java_11.Part_2.Chapter_20_JavaIO;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;

public class PushBackInputStreamDemo {
    public static void main(String[] args) {
        String s = "if (a == 4) a = 0;\n";
        byte buffer[] = s.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);
        int c;

        try (PushbackInputStream f = new PushbackInputStream(in)) {
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

        InputStream is = new InputStream() {
            @Override
            public int read() throws IOException {
                return 10;
            }

            @Override
            public byte[] readAllBytes() throws IOException {
                return "I AM STREAM".getBytes();
            }
        };

        for (int j = 2; j < 10; j++) {
            String ret = "Big mouse or ф tank?";
            byte[] buf = ret.getBytes();
            ByteArrayInputStream in2 = new ByteArrayInputStream(buf);
            try (PushbackInputStream f = new PushbackInputStream(is)) {
                int i = 0;
                int add = 0;
                char r = ' ';

                while (i < buf.length + add) {
                    r = (char) f.read();
                    System.out.print(r);
                    if (i % j == 0) {
                        f.unread(r);
                        add++;
                    }
                    i++;
                }
                System.out.println();
//            char r2 = (char)f.read();
//            System.out.println(r2);
        } catch(IOException e){
            System.out.println("I/O Exception " + e);
        }
    }
    }
}
