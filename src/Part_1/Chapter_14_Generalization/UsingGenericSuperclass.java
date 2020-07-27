package Part_1.Chapter_14_Generalization;

public class UsingGenericSuperclass {
    public static void main(String[] args) {
        Gen2WithTypePar<String,Integer> x = new Gen2WithTypePar<String,Integer>("Value is :",99);
        System.out.print(x.getOb());
        System.out.println(x.getOb2());
    }
}

class Gen1<T>{
    T ob;

    public Gen1(T ob) {
        this.ob = ob;
    }
    T getOb(){
        return ob;
    }
}
class Gen2<T> extends Gen1<T>{
    public Gen2(T ob) {
        super(ob);
    }
}

class Gen2WithTypePar<T,V> extends Gen1<T>{
    V ob2;
    public Gen2WithTypePar(T o, V o2) {
        super(o);
        ob2 = o2;
    }

    V getOb2() {
        return ob2;
    }
}