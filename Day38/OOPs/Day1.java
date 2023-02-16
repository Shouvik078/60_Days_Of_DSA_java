package Day38.OOPs;

class Person {
    // attributes
    String name; // default value NULL
    int age; // default value 0

    void walk() // methods
    {
        System.out.println("Walking");
    }

    void run() {
        System.out.println("Running");
        walk();
    }

    void run(int t) { // method overloading // compile time polymorphism
        System.out.println("Person is running since hr " + t);
    }

    void run(String n) {
        System.out.println(n);
    }

    Person() {
        System.out.println("Inside Constructor");
        name = "Raj";
        age = 52;
    }

    Person(String name, int age) { // constructor overloading
        this.name = name;
        this.age = age;
    }

    Person(Person p) // copy constructor
    {
        this.name = p.name;
        this.age = p.age;
    }

    void print() {
        System.out.println(name + " " + age);
    }
}

public class Day1 {
    public static void main(String[] args) {
        /*
         * Person p1 = new Person(); // p1 is the reference of Person object // P1
         * present in stack memory
         * System.out.println(p1); // memory address
         * p1.name = "Rintu";
         * p1.age = 23;
         * p1.print(); // o.p Raj 52 // next change to Rintu 23
         */
        Person p1 = new Person("Shouvik", 24);
        /*
         * p.print();
         * p.run(5);
         * p.run();
         */
        Person p2 = new Person(p1); // p2 and p1 different object same data
        p2.print();
        p1.print();
    }
}
