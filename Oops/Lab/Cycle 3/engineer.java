import java.util.Scanner;

class Employee {
    public void display() {
        System.out.println("Name of class is Employee");
    }

    public void calcSalary() {
        System.out.println("Salary of employee is 10000");
    }
}

class Engineer extends Employee {
    public void calcSalary() {
        System.out.println("Salary of employee is 20000");
    }
}

public class Employer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter role: (1 for Employee, 2 for Engineer)");
        int role = input.nextInt();

        Employee emp;

        if (role == 1) {
            emp = new Employee();
        } else {
            emp = new Engineer();
        }

        emp.display();
        emp.calcSalary();

        input.close();
    }
}
