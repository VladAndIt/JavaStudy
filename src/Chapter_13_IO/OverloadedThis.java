package Chapter_13_IO;

public class OverloadedThis {
    int a,b;

    public OverloadedThis(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public OverloadedThis(int a) {
//        this.a = a;
//        this.b = a;
        this(a,a);
    }

    public OverloadedThis() {
//        a = 0;
//        b = 0;
        this(0);
    }
}
