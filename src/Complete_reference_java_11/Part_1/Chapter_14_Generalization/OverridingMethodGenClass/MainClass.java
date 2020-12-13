package Complete_reference_java_11.Part_1.Chapter_14_Generalization.OverridingMethodGenClass;

public class MainClass {
    public static void main(String[] args) {
        Gen<Integer> ob = new Gen<Integer>(789);
        Gen2<Integer> ob2 = new Gen2<Integer>(79);
        Gen2<String> str = new Gen2<String>("String");

        System.out.println(ob.getOb());
        System.out.println(ob2.getOb());
        System.out.println(str.getOb());

    }
}
class Gen<T>{
    T ob;

    public Gen(T ob) {
        this.ob = ob;
    }
    T getOb(){
        System.out.println("Get2's getob():");
        return ob;
    }
}
class Gen2<T> extends Gen<T>{
    public Gen2(T ob) {
        super(ob);
    }

    @Override
    T getOb(){
        System.out.println("Get2's getob():");
        return ob;
    }
}