package Chapter_15_Lambda;

public class BasicExpression {
    public static void main(String[] args) {
        MyNumber myNum;

        myNum = () -> 123.45;
        System.out.println("A fixed value: "+ myNum.getValue());

        myNum = () -> Math.random() * 100;

        System.out.println("A random value: "+ myNum.getValue());
        System.out.println("Another random value: "+ myNum.getValue());

        //myNum = () -> "123.t5";

        BooleanTest isEven = (n)-> (n%2) == 0;
        if (isEven.isNotNeg(10))System.out.println("10 is even");
        if (isEven.isNotNeg(9))System.out.println("10 is odd");

        BooleanTest isNonNeg1 = n -> n >=0;
        if (isNonNeg1.isNotNeg(1))System.out.println("1 is non-negative");
        if (isNonNeg1.isNotNeg(-1))System.out.println("-1 is negative");

        Test2 TwoParem = (n,d)->(n%d)==0;
        if (TwoParem.isNotNegTwo(10,5)) System.out.println("5 is a factor of 10");
        if (!TwoParem.isNotNegTwo(9,4)) System.out.println("4 isn't a factor of 9");

        System.out.println(SongDecoder("RWUBWUBWUBWUBLWUB"));
    }

    public static String SongDecoder (String song)
    {
//        String t = "";
//        song = song.replace("WUB", " ").trim();
//        for (int i = 0; i < song.length(); i++) {
//         if(song.charAt(i)==' ' && song.charAt(i+1)==' ' && i+1<song.length())continue;
//         t += song.charAt(i);
//        }
//        return t;
        return song.replaceAll("(WUB)+"," ").trim();
    }
}
interface MyNumber{
    double getValue();
}

interface BooleanTest{
    boolean isNotNeg(int n);
}

interface Test2{
    boolean isNotNegTwo(int n,int y);
}

class  BooleanTest1{


}
