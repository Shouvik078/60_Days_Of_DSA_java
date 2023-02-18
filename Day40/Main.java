package Day40;

// import Day39.Teacher;      // importing Day39 Teacher package
import Day39.*;

public class Main {
    public static void main(String[] args) {
        student s1 = new student(23, "Shouvik");
        System.out.println(s1.age);
        System.out.println(s1.name);

        Teacher t = new Teacher("Sanat", 54, 20);
        System.out.println(t.age);
    }
}
