package Part_1.Chapter_15_Lambda;

public class ReferenceStaticMethod {
    static String stringOp(StringFunc2 g, String r) {
        return  g.func(r);
    }
    public static void main(String... args) {

        String inStr = "Lambda expressions increase efficiency of Java!";
        String outStr;

        outStr = stringOp(MyString::strRevers, inStr);

        System.out.println("The original string " + inStr);
        System.out.println("The changed string " + outStr);
    }
}
interface StringFunc2{
    String func(String n);
}
class MyString{
    static String strRevers(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--)result += str.charAt(i);
        return result;
    }
}

