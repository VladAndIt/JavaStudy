package Part_1.Chapter_14_Generalization.ComparisonsWithinGenHierarchy;

public class ConparisonsWithinGeneric {
    public static void main(String[] args) {
        GenOne<Integer> iob = new GenOne<Integer>(88);

        GenTwo<Integer> iob2 = new GenTwo<Integer>(8);

        GenTwo<String> str = new GenTwo<String>("Generics test");

        if (iob2 instanceof GenTwo<?>)System.out.println("iob2 is instance of Gen2");
        if (iob2 instanceof GenOne<?>)System.out.println("iob2 is instance of Gen");

        if (str instanceof GenTwo<?>)System.out.println("str is instance of Gen2");
        if (str instanceof GenOne<?>)System.out.println("str is instance of Gen");

        if (iob instanceof GenTwo<?>)System.out.println("iob is instance of the class Gen2");
        if (iob instanceof GenOne<?>)System.out.println("iob is instance of the class Gen");


    }
}
class GenOne<T>{
    T ob;

    GenOne(T ob) {
        this.ob = ob;
    }
    T getob(){
        return ob;
    }
}

class GenTwo<T> extends GenOne<T> {
    public GenTwo(T o) {
        super(o);
    }
}