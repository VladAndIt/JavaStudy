package Chapter_15_Lambda;

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
class ConstructouRefDemo {

    public static void main(String[] args) {
        MyFunc2 myClassCons = MyClass5::new;
        MyClass5 mc = myClassCons.func(100);
        System.out.println("Val in mc is "  + mc.getVal3());
    }
}
interface MyFunc2 {
    MyClass5 func(int n);
}
