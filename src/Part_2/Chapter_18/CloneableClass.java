package Part_2.Chapter_18;

public class CloneableClass  {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        var Info = new StringBuilder();

        CloneDemo original = new CloneDemo();
        CloneDemo original2;

        CloneDemo or1 = new CloneDemo();
        CloneDemo or2;

        or1.a = 330;
        or1.b = 28.49;

        or2 = (CloneDemo) or1.cloneTest();

        Info.append("original a = " + or1.a + " , b = " + or1.b + "\n");
        Info.append("original2 a = " + or2.a + " , b = " + or2.b + "\n");

        original.a = 10;
        original.b = 22;

        original2 = (CloneDemo) original.cloneTest();

        Info.append("original a = " + original.a + " , b = " + original.b + "\n");
        Info.append("original2 a = " + original2.a + " , b = " + original2.b + "\n");

        Info.append("\nTime execution: " + ((System.currentTimeMillis() - startTime)*1e-3) + " sec.\n");
        System.out.println(Info);
    }

}

class CloneDemo implements Cloneable{
    int a;
    double b;

    public Object cloneTest(){
        try {
            return (CloneDemo) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return this;
    }
}

class TestClone implements Cloneable {

}
