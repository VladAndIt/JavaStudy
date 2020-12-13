package Complete_reference_java_11.Part_2.Chapter_21_Networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class HTTP_URL_Demo {
    public static void main(String[] args) throws IOException {
        String urlPath = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        URL url = null;
        if (urlPath.length() == 0) url = new URL("https://metanit.com");
        else url = new URL(urlPath);

        HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();

        System.out.println("Request method is " + httpConnection.getRequestMethod());
        System.out.println("Response code is " + httpConnection.getResponseCode());
        System.out.println("Response Message is " + httpConnection.getResponseMessage());

        Map<String, List<String>> headerFieldsMap = httpConnection.getHeaderFields();
        Set<String> headerKeys = headerFieldsMap.keySet();

//        List<String> ListS = httpConnection.getHeaderFields();
        System.out.println("\nHere is the header: ");

        for (String k : headerKeys) {
            System.out.println("Key: " + k + " Value: " + headerFieldsMap.get(k));
        }
    }
}
