package Complete_reference_java_11.Part_2.Chapter_21_Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URL_Connection_Demo {
    public static void main(String[] args) throws IOException {
        int c;
//        Scanner keyboard = new Scanner(System.in);
//        String r = String.valueOf(keyboard.nextLine());

//        BufferedReader site = new BufferedReader(new InputStreamReader(System.in));
        String r = (new BufferedReader(new InputStreamReader(System.in))).readLine();

        URL hp = new URL(r);
        URLConnection connection = hp.openConnection();

        long d = connection.getDate();
        if (d == 0) System.out.println("No date information");
        else System.out.println("Date: " + new Date(d));

        System.out.println("Content-Type: " + connection.getContentType());

        d = connection.getExpiration();
        if (d == 0) System.out.println("No expiration information");
        else System.out.println("Expires: " + new Date(d));

        d = connection.getLastModified();
        if (d == 0) System.out.println("No last-modified information");
        else System.out.println("Last-modified: " + new Date(d));

        long len = connection.getContentLengthLong();
        if (len == -1) System.out.println("The content length unavailable");
        else System.out.println("Length: " + len);

        if (len == 0) {
            System.out.println("===== Content =====");
            try (InputStream input = connection.getInputStream()) {
                while ((c = input.read()) != -1) {
                    System.out.println((char) c);
                }
            }
        }else System.out.println("No content available!");
    }
}
