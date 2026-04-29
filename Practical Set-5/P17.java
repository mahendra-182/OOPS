interface Exam {
    boolean isPassed(int mark);
}

interface ClassifyDiv {
    String getDivision(double average);
}

class ResultP17 implements Exam, ClassifyDiv {
    public boolean isPassed(int mark) {
        return mark >= 40;
    }

    public String getDivision(double average) {
        if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else if (average >= 40) {
            return "Third Division";
        } else {
            return "Fail";
        }
    }
}

public class P17 {
    public static void main(String[] args) {
        ResultP17 r = new ResultP17();

        int mark = 55;
        double avg = 62.5;

        System.out.println("Mark: " + mark);
        System.out.println("Passed: " + r.isPassed(mark));
        System.out.println("Average: " + avg);
        System.out.println("Division: " + r.getDivision(avg));
    }
}