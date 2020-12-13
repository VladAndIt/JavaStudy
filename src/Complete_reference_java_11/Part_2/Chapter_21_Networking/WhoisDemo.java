package Complete_reference_java_11.Part_2.Chapter_21_Networking;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class WhoisDemo {
    public static void main(String[] args) throws IOException {
        int c;
        try (Socket s = new Socket("whois.internic.net", 43);) {
            s.setSoTimeout(10000);

            InputStream in = s.getInputStream();
            OutputStream out = s.getOutputStream();

            String str = (args.length == 0 ? "www.youtube.com" : args[0] + "\n");
            byte buf[] = str.getBytes();
            out.write(buf);

            while ((c = in.read()) != -1) {
                System.out.println((char) c);
            }
        }
    }
}
