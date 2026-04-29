class Employee {
    String name = "Darshil";
    String department = "Computer Engineering";

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

class Manager extends Employee {
    int teamSize = 5;

    @Override
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Team Size: " + teamSize);
    }
}

public class PR15 {
    public static void main(String[] args) {
        Employee e = new Employee();
        Manager m = new Manager();

        System.out.println("Employee Details:");
        e.displayDetails();

        System.out.println();

        System.out.println("Manager Details:");
        m.displayDetails();
    }
}