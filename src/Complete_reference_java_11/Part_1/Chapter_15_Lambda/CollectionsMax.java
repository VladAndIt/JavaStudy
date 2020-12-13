package Complete_reference_java_11.Part_1.Chapter_15_Lambda;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMax {
    public static void main(String[] args) {
        ArrayList<MyClass3> al = new ArrayList<MyClass3>();

        al.add(new MyClass3(1));
        al.add(new MyClass3(2));
        al.add(new MyClass3(27));
        al.add(new MyClass3(4));
        al.add(new MyClass3(5));

        MyClass3 maxValObj = Collections.max(al,CollectionsMax::compareMC);
        System.out.println("Maximum valur is : " + maxValObj.getVal());
    }

    static int compareMC(MyClass3 a, MyClass3 b) {
        return a.getVal() - b.getVal();
    }
}

class MyClass3 {
    private  int val;

    public MyClass3(int val) {
        this.val = val;
    }

    int getVal() {
        return val;
    }
}