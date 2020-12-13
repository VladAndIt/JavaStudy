package Complete_reference_java_11.Part_2.Chapter_20_JavaIO;

import java.io.*;

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectOutputStream obS = new ObjectOutputStream(new FileOutputStream("Sfile1.txt"))) {
            MyClass obj1 = new MyClass("Hello", -7, 2.7e10);
            System.out.println("obj:" + obj1);

            obS.writeObject(obj1);
        } catch (IOException e) {
            System.out.println("Ser" + e);
        }
        try (ObjectInputStream obS = new ObjectInputStream(new FileInputStream("Sfile1.txt"))) {
            MyClass obj2 = (MyClass)obS.readObject();
            System.out.println("obj2:" + obj2);

        } catch (IOException e) {
            System.out.println("Ser" + e);
        }
    }
}

class MyClass implements Serializable {
    String s;
    int i;
    double a;

    public MyClass(String s, int i, double a) {
        this.s = s;
        this.i = i;
        this.a = a;
    }

    public String toString() {
        return "s = " + s + "; i= " + i + "; a = " + a;
    }
}
