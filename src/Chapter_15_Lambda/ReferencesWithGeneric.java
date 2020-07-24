package Chapter_15_Lambda;

public class ReferencesWithGeneric {
    public static void main(String[] args) {
        Integer[] vals = {2, 3, 5, 5, 2, 4, 4};
        String[] strs = {"One","Two", "Three", "Four"};
        int count;

        count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Vals contains " + count + " 4s");

        count = myOp(MyArrayOps::<String>countMatching, strs, "Seven");
        System.out.println("Strs contains " + count + " Twos");


    }

    static <T> int myOp(MyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }
}
interface MyFunc <T>{
    int func(T[] vals, T v);
}

class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if(vals[i] == v) count++;
        }
        return count;
    }
}