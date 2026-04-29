public class PR9 {
    double width, height;

    public PR9(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public void display() {
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println();
    }

    public static void main(String[] args) {
        PR9 r1 = new PR9(4, 40);
        PR9 r2 = new PR9(3.5, 35.9);

        System.out.println("Rectangle 1:");
        r1.display();

        System.out.println("Rectangle 2:");
        r2.display();

        if (r1.getArea() > r2.getArea()) {
            System.out.println("Rectangle 1 has larger area");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("Rectangle 2 has larger area");
        } else {
            System.out.println("Both rectangles have equal area");
        }
    }
}