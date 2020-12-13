package Complete_reference_java_11.Part_1.Chapter_15_Lambda;

class ReferenceStaticMethod1 {

    static String stringOp(StringFunc2 g, String r) {
        return  g.func(r);
    }
    public static void main(String... args) {

        String inStr = "Lambda expressions increase efficiency of Java!";
        String outStr;
        MyString2 srtOp = new MyString2();
        outStr = stringOp(srtOp::strRevers, inStr);

        System.out.println("The original string " + inStr);
        System.out.println("The changed string " + outStr);

        outStr = stringOp(MyString1::strRevers, outStr);

        System.out.println("The original string " + inStr);
        System.out.println("The changed string " + outStr);
    }
}

interface StringFunc3{
    String func(String n);
}

class MyString1{
    static String strRevers(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--)result += str.charAt(i);
        return result;
    }
}
class MyString2{
    String strRevers(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--)result += str.charAt(i) + " ";
        return result;
    }
}

