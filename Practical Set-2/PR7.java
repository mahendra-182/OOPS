import java.util.Scanner;

public class PR7 {
    private String employeeName;
    private double employeeSalary;

    public void readEmployeeData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter Employee Salary: ");
        employeeSalary = sc.nextDouble();
    }

    public void displayEmployeeData() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee Salary: " + employeeSalary);
    }

    public static void main(String[] args) {
        PR7 emp = new PR7();
        emp.readEmployeeData();
        emp.displayEmployeeData();
    }
}