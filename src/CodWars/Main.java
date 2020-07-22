package CodWars;
import java.lang.reflect.Array;
import java.math.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(digPow(47016,2));
        System.out.println(digPow(63761,3));
        System.out.println(digPow(8136,1));
        System.out.println(digPow(1306,1));
//        System.out.println(digPow(92,1));
//        System.out.println(digPow(92,1));
//        System.out.println(digPow(92,1));
    }
    public static long digPow(int n, int p) {
        String s = n+"";
        var arrayOfpow = new long[s.length()];
        int r=0;
        int powCounter=p;
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int Elem = Integer.parseInt(String.valueOf(s.charAt(i)));
            if(Elem != 0){
                arrayOfpow[r] = (int) Math.pow(Elem,powCounter);
            }
            powCounter++;
            sum+=arrayOfpow[r++];
        }
        //if(sum == n)return 1;
        System.out.print(Arrays.toString(arrayOfpow));
        System.out.println(sum);
        for (long i = p; i < sum; i++) {
            if(n*i == sum){
                return i;
            }
        }
        if (n*1==sum)return 1;
        return -1;
    }
}
