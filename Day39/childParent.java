/*
 * package Day39;
 * 
 * class Person {
 * int age;
 * String name;
 * 
 * Person(String name, int age) {
 * this.name = name;
 * this.age = age;
 * }
 * 
 * void print() {
 * System.out.println("Parent Print");
 * }
 * }
 * 
 * class Dev extends Person {
 * int github_id;
 * 
 * Dev(String name, int age, int g) {
 * super(name, age);
 * github_id = g;
 * }
 * 
 * void print() {
 * System.out.println("Child print");
 * }
 * }
 * 
 * public class childParent {
 * public static void main(String[] args) throws java.lang.Exception {
 * Person p = new Person("Rintu", 23);
 * System.out.println(p.age);
 * p.print();
 * /*
 * Dev d = new Dev("aa", 23, 8);
 * System.out.println(d.age);
 * d.print();
 */
/* */