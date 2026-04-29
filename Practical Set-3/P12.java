public class PR12 {

    public double calculateVolume(double side) {
        return side * side * side;
    }

    public double calculateVolume(double l, double w, double h) {
        return l * w * h;
    }

    public double calculateVolumeSphere(double r) {
        return (4.0 / 3.0) * Math.PI * r * r * r;
    }

    public static void main(String[] args) {
        PR12 obj = new PR12();

        System.out.println("Cube Volume: " + obj.calculateVolume(3));
        System.out.println("Rectangular Cube Volume: " + obj.calculateVolume(2, 3, 4));
        System.out.println("Sphere Volume: " + obj.calculateVolumeSphere(2));
    }
}