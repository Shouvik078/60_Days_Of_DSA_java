package Day39;

class Millenials {
    int age;
    String name;

    Millenials(String name, int age) { // parent class
        this.name = name;
        this.age = age;
    }

    void saving() {
        System.out.println("Invest money in FD");
    }
}

class GenZ extends Millenials { // child class *GenZ* extends with parent class
    int coolness;

    GenZ(String name, int age, int coolness) {
        super(name, age);
        this.coolness = coolness;
    }

    void saving() {
        super.saving(); // at first parent class print
        System.out.println("Invest in Stocks"); // then child class
    }
}

public class Generation {
    public static void main(String[] args) {
        GenZ g1 = new GenZ("A", 23, 80);

        g1.saving(); // overridding on parent class
    }
}
