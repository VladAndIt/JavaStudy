package Part_2.Chapter_21_Networking;

import Part_2.Chapter_20_JavaIO.NIO.InputStreamNIO;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpClientDemo {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient myHC = HttpClient.newHttpClient();
        HttpRequest myReq = HttpRequest.newBuilder(new URI("https://www.google.com/")).build();

        HttpResponse<InputStream> myResp = myHC.send(myReq, HttpResponse.BodyHandlers.ofInputStream());

        System.out.println("Response code is " + myResp.statusCode());
        System.out.println("Request method is " + myReq.method());

        HttpHeaders hdrs = myResp.headers();

        Map<String, List<String>> hdrMap = hdrs.map();
        Set<String> hdrField = hdrMap.keySet();

        System.out.println("\nHere is the header:");
        for (String k: hdrField) {
            System.out.println("Key: " + k + " Value: " + hdrMap.get(k));
        }
        System.out.println("\nHere is the body:");

        InputStream input = myResp.body();
        int c;
        while ((c = input.read()) != -1) {
            System.out.print((char) c);
        }
    }
}
