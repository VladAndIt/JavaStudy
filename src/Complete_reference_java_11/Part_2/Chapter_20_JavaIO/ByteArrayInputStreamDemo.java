package Complete_reference_java_11.Part_2.Chapter_20_JavaIO;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {
        String tmp = "abcdfig";
        String tmp2 = "abc";
        byte b[] = tmp.getBytes();
        byte b2[] = tmp2.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(b2);

        ByteArrayInputStream input1 = new ByteArrayInputStream(b);
        ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0 ,3);

        System.out.println(Arrays.toString(b));
        System.out.println(input1.read());
        System.out.println(input2);

        for (int i = 0; i < 2; i++) {
            int c;
            while ((c = in.read()) != -1) {
                if (i == 0) System.out.print((char) c);
                else System.out.print(Character.toUpperCase((char) c));
            }
            System.out.println();
            in.reset();// pointer at zero index of the streamInput
        }
    }
}
