package Complete_reference_java_11.Part_1.Chapter_15_Lambda;

class MyClass5 {

    private int val2 = 0 ;
    public int MyClass5() {
        return val2;
    }

    public MyClass5(int val) {
        this.val2 = val;
    }

    int getVal3() {
        return  val2;
    }

}
class ConstructorRefDemo {

    public static void main(String[] args) {
        MyFunc2 myClassCons = MyClass5::new;
        MyClass5 mc = myClassCons.func(100);
        System.out.println("Val in mc is "  + mc.getVal3());

        MyFunc6 myClassCons30 = MyClass30::new;
        MyClass30 mc3 = myClassCons30.func(200);
        System.out.println("val in me is " + mc3.getVal2());
    }
}
interface MyFunc2 {
    MyClass5 func(int n);
}
interface MyFunc6 {
    MyClass30 func(int n);
}

class MyClass30 {
    private int val;

    public MyClass30() {
        val = 0;
    }

    public MyClass30(int val) {
        this.val = val;
    }

    int getVal2() {
        return val;
    }
}

