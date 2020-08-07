package Part_2.Chapter_21_Networking;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLDemo {
    public static void main(String[] args) throws IOException {
        URL hp = new URL("https://github.com:80");

        System.out.println("Protocol: " + hp.getProtocol() +
                "\nPort: " + hp.getPort() +
                "\nHost: " + hp.getHost() +
                "\nFile: " + hp.getFile() +
                "\nExit: " + hp.toExternalForm());
        URL hp2 = new URL("https://vk.com/tot_camyi_rembo");

        URLConnection connection = hp2.openConnection();


        System.out.println("Fields: " + connection.getHeaderFields() +
                "\nContent TimeOut: " + connection.getConnectTimeout() +
                "\nContent Type: " + connection.getContentType() +
                "\nContent: " + connection.getContent() +
                "\nContent Data: " + new Date(connection.getDate()) +
                "\nContent Length: " + connection.getContentLength());


    }
}
