package Part_1.Chapter_13_IO;

public class InstanceOF {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A)System.out.println("a is instance of A");
        if (b instanceof B)System.out.println("b is instance of B");
        if (c instanceof C)System.out.println("c is instance of C");

        if (c instanceof A)System.out.println("c can cast to type A");
        if (c instanceof C)System.out.println("c can cast to type C\n");

        A ob;

        ob = d;//link to d-object
        System.out.println("ob links d");
        if (ob instanceof D)System.out.println("ob is instance of D\n");
        ob = c;
        System.out.println("ob links c");
        if (ob instanceof D)System.out.println("ob can cast to type D");
        else System.out.println("ob can't cast to type D");
        if (ob instanceof A)System.out.println("ob can cast to type A\n");

        if (a instanceof Object)System.out.println("a can cast to type Object");
        if (b instanceof Object)System.out.println("b can cast to type Object");
        if (c instanceof Object)System.out.println("c can cast to type Object");
        if (d instanceof Object)System.out.println("d can cast to type Object");
    }
}
class A{
    int i,j;
}
class B{
    int i,j;
}
class C extends A{
    int k;
}
class D extends A{
    int k;
}
