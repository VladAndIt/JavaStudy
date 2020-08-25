package Metanit.Collections.Chapter_3_OOP;

public class MainObjClass {
    public static void main(String[] args) {
        Person Tom = new Person();
        Person Jerry = new Person("Jerry");
        Person Bob = new Person("Bob", 67);
        System.out.print(Tom);
        System.out.print(Jerry);
        System.out.print(Bob);

        Tom.setName("Tom");
        Tom.setAge(35);

        System.out.print(Tom);
    }
}
class Person {
    private String name;
    private int age;

    {
        name = "Undefined";
        age = 0;
    }
    public Person() {
    }

    public Person(String name) {
        this.name = name;
//        age = 18; // values passes from initializer there age = 0
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

