package Part_2.Chapter_19_JavaUtils;

import java.util.StringTokenizer;

public class MyStringTokenizer {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreElements()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);

        }
    }
    static String in = "title = Java: The Complete Reference;" +
            "author = Schildt;" +
            "publisher = Oracle press;" +
            "copyright = 2019";

}


