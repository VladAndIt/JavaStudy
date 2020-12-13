package Complete_reference_java_11.Part_1.Chapter_14_Generalization;

public class GenericConstructors {
    public static void main(String[] args) {
        GenConstructorDemo t1 = new GenConstructorDemo(100);
        GenConstructorDemo t2 = new GenConstructorDemo(123.4F);

        t1.showVal();
        t2.showVal();
    }
}
class  GenConstructorDemo{
    private double val;

    <T extends Number> GenConstructorDemo(T arg){
        val = arg.doubleValue();
    }

    void showVal(){
        System.out.println("val: " + val);
    }
}
