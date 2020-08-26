package Metanit.Collections.Chapter_3_OOP;

public class AbstractClass {

}

abstract class Human {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }

    public abstract void display();
}

class Employee1 extends Human {

    public Employee1(String name) {
        super(name);
    }

    @Override
    public void display() {

    }
}


