package Part_2.Chapter_18;

public class ObjectClass {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        var Info = new StringBuilder();
        X x = new X();
        Y y = new Y();

        Class<?> clObj;

        clObj = x.getClass();
        Info.append("x is object of type " + clObj.getName());

        clObj = y.getClass();
        Info.append("\ny is object of type " + clObj.getName());

        clObj = clObj.getClass();
        Info.append("\ny's is object of type " + clObj.getName());

        Info.append("\nTime execution: " + ((System.currentTimeMillis() - startTime)*1e-3) + " sec.\n");

        Info.append("\nNested host " + clObj.getNestHost());
        Info.append("\nMember host " + clObj.getNestMembers());

        System.out.println(Info);
    }
}

class X {
    int a;
    float b;
}

class Y extends X {
    double c;
}