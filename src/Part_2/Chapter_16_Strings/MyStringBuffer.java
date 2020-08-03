package Part_2.Chapter_16_Strings;

import java.util.Arrays;

public class MyStringBuffer {
    public static void main(String[] args) {
        var sb = new StringBuffer("Hello");
        var sb1 = new StringBuffer("Hello2s");
        System.out.println("buffer = " + sb);
        System.out.println("buffer = " + sb.length());
        System.out.println("buffer = " + sb.capacity());

        System.out.println("buffer before charAt = " + sb);
        System.out.println("charAt(1) before = " + sb.charAt(1));

        sb.setCharAt(1,'g');
        sb.setLength(2);
        System.out.println("after buffer = " + sb);
        System.out.println("charAt(1) after = " + sb.charAt(1));
        char buf[] = new char[sb1.length()-1];
        sb1.getChars(0,sb1.length()-1,buf,0);
        System.out.println("Buf char via string line : " + Arrays.toString(buf) + " ? " + sb1);
        System.out.println("Buf append : " + sb.append(buf));
        System.out.println("Buf insert : " + sb.insert(1,buf));
        System.out.println("Buf reverse : " + sb.reverse());
        System.out.println("Delete : " + sb.delete(0,5));
        System.out.println("Buf append : " + sb.deleteCharAt(sb.length()-1));
        System.out.println("Buf replace: " + sb.replace(2,5,"was"));


    }
}
