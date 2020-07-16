package Chapter_14_Generalization;

public class BasisGeneralization {
    public static void main(String[] args) {
        BasisGen<Integer> iOb = new BasisGen<Integer>(78);
        iOb.ShowType();
        int v = iOb.getOb();
        System.out.println("Value is " + v);

        BasisGen<String> strOb = new BasisGen<>("Shop!");
        strOb.ShowType();
        String strt = strOb.getOb();
        System.out.println("Value is " + strt);
    }
}
class BasisGen<T>{
    T ob;

    public BasisGen(T ob) {
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }

    void ShowType(){
        System.out.println("Type T is " + ob.getClass().getName());
    }

}

