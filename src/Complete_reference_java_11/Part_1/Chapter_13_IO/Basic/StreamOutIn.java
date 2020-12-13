package Complete_reference_java_11.Part_1.Chapter_13_IO.Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamOutIn {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the symbols, 'q' for exit!");
        do {
            c = (char) br.read();
            System.out.println("->"+c);
        }while (c != 'q');
        BufferString();
    }
    static void BufferString() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str[] = new String[10];
        System.out.println("Input string!");
        System.out.println("Stop for exit!");

        for (int i = 0; i < 10; i++) {
            str[i] = br.readLine();
            if(str[i].equals("stop")) break;
        }
        for (int i = 0; i < 10; i++) {
            if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }

//        do {
//            str = br.readLine();
//            System.out.println("->"+str);
//        }while (!str.equals("stop-"));

    }
}
