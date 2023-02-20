package Day41;

class Person {
    String name;
}

class Student {
    int marks;
}

public class instanceOf {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println(p instanceof Person); // true
        // System.out.println(p instanceof Student); // error
        Student s = null;
        System.out.println(s instanceof Student); // false
    }
}
