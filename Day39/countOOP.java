package Day39;

class Person {
    int count;
    String name;
    int age;

    Person(String name, int count, int age) {
        this.name = name;
        this.count = count;
        this.age = age;
    }
}

class Dev extends Person {
    int count;

    Dev(String name, int count, int age) {
        super(name, count, age);
        this.count = 8;
        super.count = 7;
    }
}

public class countOOP {
    public static void main(String[] args) {
        // Dev d = new Dev("A",25,24);
    }
}
