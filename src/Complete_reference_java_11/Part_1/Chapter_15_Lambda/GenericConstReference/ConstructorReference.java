package Complete_reference_java_11.Part_1.Chapter_15_Lambda.GenericConstReference;

class MyClass5<T> {

    private T val;

    public MyClass5() {
        val = null;
    }

    public MyClass5(T val) {
        this.val = val;
    }

    T getVal3() {
        return  val;
    }

}

class ConstructorRefDemo {

    public static void main(String[] args) {
       MyFuncR<MyClassR<Double>,Double> myClassRDoubleMyFuncR3 = MyClassR<Double>::new;

        MyClassR<Double> mcR = myClassFactory(myClassRDoubleMyFuncR3, 198.7);
        System.out.println("val in mcR is"+ mcR.getVal5());

        MyFuncR<MyClassR2, String> myClassR2StringMyFuncR2 = MyClassR2::new;
        MyClassR2 myClassR2 = myClassFactory(myClassR2StringMyFuncR2, "jyt");

        System.out.println("str in mcR "+ myClassR2.getVal5());
    }

    static <R, T> R myClassFactory(MyFuncR<R, T> cons, T v) {
        return cons.func(v);
    }
}

interface MyFunc2<T> {
    MyClass5<T> func(T n);
}

interface MyFuncR<R, T> {
    R func(T v);
}

class MyClassR<T> {
    private  T val;

    public MyClassR() {
        val = null;
    }

    public MyClassR(T val) {
        this.val = val;
    }

    T getVal5() {
        return val;
    }
}

class MyClassR2 {
    String str;

    public MyClassR2() {
        str = "";
    }

    public MyClassR2(String str) {
        this.str = str;
    }

    String getVal5() {
        return str;
    }
}

