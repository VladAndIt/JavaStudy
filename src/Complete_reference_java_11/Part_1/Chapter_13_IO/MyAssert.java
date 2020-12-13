package Complete_reference_java_11.Part_1.Chapter_13_IO;

public class MyAssert {
    static int val = 3;
    static int getNum(){
        return val--;
    }
    public static void main(String[] args) {
        int n;
        for (int i = 0; i <10 ; i++) {
            n= getNum();
            assert n>0;//if n==0 isn't confirmed
            System.out.println("n equals " + n);
        }
    }
}
