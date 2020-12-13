package Complete_reference_java_11.Part_2.Chapter_25_RegularExpression.Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionAdvancedDemo {
    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("java.awt.Dimension");
            System.out.println("Constructors:");

            Constructor<?> constructor[] = c.getConstructors();
            for (int i = 0; i < constructor.length; i++) {
                System.out.println(" " + constructor[i]);
            }
            System.out.println("Fields:");
            Field fields[] = c.getFields();
            for (int i = 0; i < fields.length; i++) {
                System.out.println(" " + fields[i]);
            }
            System.out.println("Methods:");
            Method methods[] = c.getMethods();
            for (int i = 0; i < methods.length; i++) {
                System.out.println(" " + methods[i]);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
