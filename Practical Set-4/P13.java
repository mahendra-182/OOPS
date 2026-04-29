class Shape {
    double d1, d2;

    public void getData(double d1, double d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Triangle extends Shape {
    public double getArea() {
        return 0.5 * d1 * d2;
    }
}

class Rectangle extends Shape {
    public double getArea() {
        return d1 * d2;
    }
}

public class PR13 {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.getData(10, 5);

        Rectangle r = new Rectangle();
        r.getData(4, 6);

        System.out.println("Triangle Area: " + t.getArea());
        System.out.println("Rectangle Area: " + r.getArea());
    }
}