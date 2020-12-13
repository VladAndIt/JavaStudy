package Complete_reference_java_11.Part_1.Chapter_15_Lambda;

public class LambdaWithArguments {
    public static void main(String[] args) {
        String inStr = "Lambda expressions ";
        String outStr;

        System.out.println("That is original string" + inStr);

        outStr = stringOp((str)-> str.toUpperCase(),inStr);
        System.out.println("That's string in upper case " + outStr);

        outStr = stringOp((str) -> {
            String result = "";

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j)!= ' ')result +=str.charAt(j);
            }
            return result;
        },inStr);

        System.out.println("That's string without spaces " + outStr);

        StringFunc reverse = (str)->{
            String res = "";
            for (int i = str.length()-1; i >=0; i--) {
                res+=str.charAt(i);
            }
            return res;
        };
        System.out.println("The generic string : " + stringOp(reverse,inStr));
    }
    static String stringOp(StringFunc sf,String s){
        return sf.func(s);
    }
}
interface StringFunc{
    String func(String n);
}