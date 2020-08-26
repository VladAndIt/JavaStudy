package Metanit.Collections.Chapter_3_OOP;

public class Inheritance {
    public static void main(String[] args) {
        Employee sam = new Employee("Sam", 100);
        sam.display();
        sam.work();
        PersonMain tom = new PersonMain("Tom");
        tom.display();
        PersonMain man = new Employee("Bob", 323);
        man.display();
    }
}
class PersonMain { //if class is final won't be inherited
    private String name;

    public PersonMain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {//if method is final won't be inherited
        System.out.printf("Name: %s \n", name);
    }
}

class Employee extends PersonMain {
    private int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public void work() {
        System.out.printf("%s salary is %s \n", getName(),salary);
    }

    @Override
    public void display() {
        System.out.printf("Name: %s  - his salary is - %d\n", getName(), salary);

    }

}
