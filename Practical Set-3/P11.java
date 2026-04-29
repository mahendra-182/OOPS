import java.util.Scanner;

public class PR11 {
    String collegeName;

    public PR11(String collegeName) {
        this.collegeName = collegeName;
    }

    class Admission {
        String studentName;
        String course;

        public void accept() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Student Name: ");
            studentName = sc.nextLine();
            System.out.print("Enter Course: ");
            course = sc.nextLine();
        }

        public void display() {
            System.out.println("College Name: " + collegeName);
            System.out.println("Student Name: " + studentName);
            System.out.println("Course: " + course);
        }
    }

    public static void main(String[] args) {
        PR11 college = new PR11("SSASIT");

        PR11.Admission adm = college.new Admission();

        adm.accept();
        adm.display();
    }
}