package Day38.OOPs;

class ComplexNumber {
    int real;
    int img;

    ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }

    /*
     * ComplexNumber() {
     * real = 0;
     * img = 0;
     * }
     */

    void print() {
        System.out.println(this);
        System.out.println(this.real + " + " + this.img + "i");
    }

    void add(ComplexNumber c) {
        int addReal = this.real + c.real;
        int addimg = this.img + c.img;
        System.out.println(addReal + " + " + addimg + "i");
    }
}

public class complexNumberADD {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 5);
        c1.print();
        ComplexNumber c2 = new ComplexNumber(2, 4);
        c2.print();
        c1.add(c2);
    }
}
