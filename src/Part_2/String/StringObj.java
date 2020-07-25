package Part_2.String;

public class StringObj {
    public static void main(String[] args) {
        char c[] = {'J','5','u','G',66,33,22,55,66};
        String s1 = new String(c,2,1);
        String s2 = new String(c);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.length());

        Box b = new Box(10, 12, 14);
        String s = "Box b :" + b;
        System.out.println(b);
        System.out.println(s);

        char ch;
        ch = "sad".charAt(1);
        System.out.println(ch);

        String str = "That demo padding!";
        char buf[] = new char[5];
        System.out.println(buf);
        str.getChars(0,4,buf,0);
        System.out.println(buf);
        char bufBytes[] = new char[5];
       // str.getBytes(0,4,bufBytes,0);
        System.out.println(str.toCharArray());

        System.out.println("-----Equals-----");
        String sb1 = "That a string!";
        String sb2 = "That is the second string!";
        String sb3 = "That a string!";
        String sb4 = "That a STRING!";

        System.out.println("sb1 ? sb2 :" + sb1.equals(sb2));
        System.out.println("sb1 ? sb3 :" + sb1.equals(sb3));
        System.out.println("sb1 ? sb4 :" + sb1.equals(sb4));

        System.out.println("---no case sensitive---");

        System.out.println("sb1 ? sb4 :" + sb1.equalsIgnoreCase(sb4));

        System.out.println("---region matches---");

        System.out.println("sb3 ? sb4 :" + sb3.regionMatches(false,6,sb4,6,6));
        System.out.println("sb3 ? sb4 case:" + sb3.regionMatches(true,6,sb4,6,6));

        System.out.println("---Start End---");

        System.out.println("sb3 starts with That:" + sb3.startsWith("That"));
        System.out.println("sb3 starts with a, index 5:" + sb3.startsWith("a",5));
        System.out.println("sb4 ends with string:" + sb4.endsWith("STRING!"));

        System.out.println("---Equals or == --");

        System.out.println("sb1 ? sb3 :" + sb1.equals(sb3));
        System.out.println("sb1 == sb3 :" + (sb1==sb3));

        System.out.println("--- CompareTo ---");

        System.out.println("sb3 compare to sb4:" + sb3.compareTo(sb4));
        System.out.println("sb1 compare to sb3:" + sb1.compareTo(sb3));

        System.out.println("--- IndexOf ---");

        System.out.println("sb3 IndexOf T:" + sb3.indexOf("T"));
        System.out.println("sb1 compare to sb3:" + sb1.lastIndexOf("a",2));

        System.out.println("--- IndexOf ---");
    }
}

class Box {
    double width;
    double height;
    double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }
}