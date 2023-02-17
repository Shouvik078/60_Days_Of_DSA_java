package Day39;

class Person {
    int age;
    String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    void print() {
        System.out.println("Name : " + name + " Age : " + age);
    }

    static void sayHi() {
        System.out.println("Parent hi");
    }
}

class Developer extends Person {
    int experience;

    Developer(String name, int age, int exp) {
        super(age, name);
        experience = exp;
    }

    void print() {
        System.out.println("Name : " + name + " age " + age + " Experience : " + experience);
    }

    static void sayHi() {
        System.out.println("Child Hi");
    }
}

class Doctor extends Person {
    String degree;

    Doctor(String name, int age, String deg) {
        super(age, name);
        degree = deg;
    }

    void print() {
        System.out.println("Name : " + name + " age " + age + " Degree " + degree);
    }
}

public class arrayOOP {
    public static void main(String[] args) throws java.lang.Exception {
        /*
         * Person p1 = new Doctor("Shouvik", 23, "MBBS");
         * Person p2 = new Developer("Rintu", 23, 2);
         * Person[] pp = { p1, p2 };
         * for (Person p : pp) {
         * p.print();
         */
        // Person p3 = new Developer("Aadarsh", 24, 2);
        {
            // p3.sayHi(); // Parent Hi printed because static method can not be overridden
        }
    }
}

// run it on Online GDB