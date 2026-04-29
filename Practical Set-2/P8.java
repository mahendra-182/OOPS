public class PR8 {
    int x, y;

    public PR8() {
        x = 5;
        y = 5;
    }

    public PR8(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public PR8(PR8 p) {
        this.x = p.x;
        this.y = p.y;
    }

    public void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        PR8 p1 = new PR8();
        PR8 p2 = new PR8(10, 20);
        PR8 p3 = new PR8(p2);

        System.out.println("Default Constructor:");
        p1.display();

        System.out.println("Parameterized Constructor:");
        p2.display();

        System.out.println("Copy Constructor:");
        p3.display();
    }
}