package Day38.OOPs;

class Box {
    int length;
    int width;
    int height;

    Box(int length, int width, int height) // 1.
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    Box(int side) // for cuboied
    {
        length = side;
        width = side;
        height = side;
    }

    Box() {
        length = 0;
        height = 0;
        width = 0;
    }
}

// another different class, apart from Box
class BoxWeight extends Box // link BoxWeight class to Box class by extends
{
    int weight;

    BoxWeight() {
        this.weight = 0;
    }

    BoxWeight(int weight, int length, int height, int width) {
        super(length, width, height); // Calling 1. up^
        this.weight = weight;
    }

    void print() {
        System.out.println(this.weight + " " + super.height);
    }
}

public class inheritanceOOP3 {
    public static void main(String[] args) {
        Box b1 = new Box(4, 5, 6);
        System.out.println(b1.length + " " + b1.height + " " + b1.width); // 4 6 5 compiler inteligent enough
        BoxWeight b2 = new BoxWeight(8, 6, 5, 2);
        System.out.println(b2.weight + " " + b2.length + " " + b2.height + " " + b2.width);
        b2.print();
    }
}
