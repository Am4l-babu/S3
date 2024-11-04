import java.util.Scanner;

class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    public Employee(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
    }
}

class Officer extends Employee {
    String specialization;

    public Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Specialization: " + specialization);
    }
}

class Manager extends Employee {
    String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Officer Details:");
        System.out.print("Name: ");
        String officerName = sc.nextLine();
        System.out.print("Age: ");
        int officerAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Phone Number: ");
        String officerPhone = sc.nextLine();
        System.out.print("Address: ");
        String officerAddress = sc.nextLine();
        System.out.print("Salary: ");
        double officerSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Specialization: ");
        String officerSpecialization = sc.nextLine();

        Officer officer = new Officer(officerName, officerAge, officerPhone, officerAddress, officerSalary, officerSpecialization);

        System.out.println("\nEnter Manager Details:");
        System.out.print("Name: ");
        String managerName = sc.nextLine();
        System.out.print("Age: ");
        int managerAge = sc.nextInt();
        sc.nextLine();
        System.out.print("Phone Number: ");
        String managerPhone = sc.nextLine();
        System.out.print("Address: ");
        String managerAddress = sc.nextLine();
        System.out.print("Salary: ");
        double managerSalary = sc.nextDouble();
        sc.nextLine();
        System.out.print("Department: ");
        String managerDepartment = sc.nextLine();

        Manager manager = new Manager(managerName, managerAge, managerPhone, managerAddress, managerSalary, managerDepartment);

        System.out.println("\nOfficer Details:");
        officer.printDetails();

        System.out.println("\nManager Details:");
        manager.printDetails();

        sc.close();
    }
              }
