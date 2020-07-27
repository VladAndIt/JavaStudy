package Part_1.Chapter_14_Generalization;

public class TypeInterfaceGen {
    public static void main(String[] args) {
//        MyCharacter t = new MyCharacter();
//            var c = Boolean.valueOf("true");
//            System.out.println(c);
        Integer w = 100;
        int i = w;
        System.out.println(i  + " " + w);
    }
}
class MyClass<T,V>{
    T ob1;
    V ob2;

    public MyClass(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }
}
