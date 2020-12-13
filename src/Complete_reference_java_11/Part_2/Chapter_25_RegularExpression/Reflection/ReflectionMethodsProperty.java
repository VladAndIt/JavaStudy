package Complete_reference_java_11.Part_2.Chapter_25_RegularExpression.Reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionMethodsProperty {
    public static void main(String[] args) {
      try{
          A a = new A();
          Class<?> c =a.getClass();
          System.out.println("Public methods:");
          Method methods[] = c.getDeclaredMethods();
          for (int i = 0; i < methods.length; i++) {
              int modifiers = methods[i].getModifiers();
              if (Modifier.isPublic(modifiers)) {
                  System.out.println(" " + methods[i].getName() + methods[i]);
              }
          }
      } catch (SecurityException e) {
          e.printStackTrace();
      }

    }
}

class A {
    public void a1() {

    }
    public void a2() {

    }
    protected void a3() {

    }
    private void a4() {

    }
}
