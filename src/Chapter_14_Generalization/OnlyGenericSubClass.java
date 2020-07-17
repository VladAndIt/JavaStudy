package Chapter_14_Generalization;

public class OnlyGenericSubClass {
    int num;

    public OnlyGenericSubClass(int num) {
        this.num = num;
    }
    int getNum(){
        return num;
    }

    public static void main(String[] args) {
        Gen<String> w = new Gen<String>("Hello",99);
        System.out.println(w.getOb() + "");
        System.out.println(w.getNum() + "");

        OnlyGenericSubClass i = new OnlyGenericSubClass(3);
        System.out.println(i.getNum() + "");
    }
}

class Gen<T> extends OnlyGenericSubClass{
    T o;
    public Gen(T o,int num) {
        super(num);
        this.o = o;
    }

    T getOb(){
        return o;
    }
}
