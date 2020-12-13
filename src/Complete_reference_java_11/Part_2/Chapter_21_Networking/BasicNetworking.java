package Complete_reference_java_11.Part_2.Chapter_21_Networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class BasicNetworking {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress Address = InetAddress.getLocalHost();
        System.out.println(Address);
        Address = InetAddress.getByName("www.nba.com");
        System.out.println(Address);
        InetAddress SW[] = InetAddress.getAllByName("www.youtube.com");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }
    }
}
