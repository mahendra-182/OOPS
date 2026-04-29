// P19 - Packages demo (Student base class + Result subclass in same file without package declarations)

class Student {
    protected int rollNo;
    protected String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public void displayStudent() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
    }
}

class ResultP19 extends Student {
    int marks1, marks2, marks3;

    public ResultP19(int rollNo, String name, int m1, int m2, int m3) {
        super(rollNo, name);
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    public void displayResult() {
        displayStudent();
        int total = marks1 + marks2 + marks3;
        double average = total / 3.0;

        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
    }
}

public class P19 {
    public static void main(String[] args) {
        ResultP19 r = new ResultP19(1, "Darshil", 80, 75, 90);
        r.displayResult();
    }
}
