interface Classify {
    String getDivision(double average);
}

class ResultP16 implements Classify {
    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else {
            return "No Division";
        }
    }
}

public class P16 {
    public static void main(String[] args) {
        ResultP16 r = new ResultP16();
        System.out.println("Average: 65.0");
        System.out.println("Division: " + r.getDivision(65));
    }
}