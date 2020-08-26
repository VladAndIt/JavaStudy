package Metanit.Collections.Chapter_3_OOP;

public class NestedClasses {
    public static void main(String[] args) {
        PersonWithInnerClass tom = new PersonWithInnerClass("Tom", "qwerty");
        tom.displayPerson();
        tom.account.displayInfo();

        PersonWithInnerClass bob = new PersonWithInnerClass("Bob");
        bob.setAccount("12345");
    }
}

class PersonWithInnerClass {
    private String name;
    Account account;

    public PersonWithInnerClass(String name) {
        this.name = name;
    }

    PersonWithInnerClass(String name, String password) {
        this.name = name;
        account = new Account(password);

    }

    public void displayPerson() {
        System.out.format("Person \t Name: %s \t Password: %s \n", name, account.password);
    }

    public class Account {
        private String password;

        Account(String password) {
            this.password = password;
        }

        void displayInfo() {
            System.out.format("Class Account in main class \n Login: %s \t Password: %s \n", PersonWithInnerClass.this.name, password);
        }
    }

    public void setAccount(String password) {
        class Account2 {
            void display() {
                System.out.format("Class 'Account' in method \n Login: %s \t Password: %s \n", PersonWithInnerClass.this.name, password);
            }
        }
        Account2 account2 = new Account2();
        account2.display();
    }

}
