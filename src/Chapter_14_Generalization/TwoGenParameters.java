package Chapter_14_Generalization;

public class TwoGenParameters {
    public static void main(String[] args) {
        TwoGenDemo<Integer,String> doubleParanGen = new TwoGenDemo<Integer,String>(89,"Generalization");
        doubleParanGen.ShowTypes();

        int v = doubleParanGen.getOb1();
        System.out.println("Values1 : " + v);

        String str = doubleParanGen.getOb2();
        System.out.println("Values2 : " + str);


    }
}
class TwoGenDemo<T,V>{
    T ob1;
    V ob2;

    public TwoGenDemo(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    void ShowTypes(){
        System.out.println("Type T: " + ob1.getClass().getName());
        System.out.println("Type V: " + ob2.getClass().getName());
    }

    T getOb1(){
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}