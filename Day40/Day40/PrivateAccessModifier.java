package Day40;

class Employee {
    String name;
    int age;
    private int salary;

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /*
     * void print() {
     * System.out.println("Salary : " + salary);
     * }
     */

    public void getSalary(int priv) {
        if (priv < 2) {
            System.out.println("You cant't see Salary");
            return;
        }
        System.out.println(salary);
    }

    public void setSalary(int s, int priv) {
        if (priv < 2) {
            System.out.println("You can't set salary");
            return;
        }
        salary = s;
    }
}

public class PrivateAccessModifier {
    public static void main(String[] args) {
        Employee e1 = new Employee("Shouvik", 23, 45000);
        // e1.salary = 25000;
        // e1.print();
        // e1.getSalary(2);
        e1.setSalary(250, 5);
    }
}
