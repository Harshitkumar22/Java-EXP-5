class Employee{    // Employee class
    private String name;
    private int empid;
    private double salary;

    public Employee(){   // Default constructor
        this.name="Harshit";
        this.empid=0;
        this.salary=0.0;
    }

    public Employee(String name, int empid, double salary){  // Parameterized constructor
        this.name=name;
        this.empid=empid;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    // Method to increase salary by a given percentage
    public void increaseSalary(double percentage){
        if(percentage>0){
            salary+=salary*(percentage / 100);
            System.out.println("Salary increased by " + percentage + "%.");
        }else{
            System.out.println("Invalid percentage. Salary remains unchanged.");
        }
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Salary: rs" + salary);
    }
}

class Manager extends Employee{     // Manager subclass extending Employee
    private String department;

    public Manager(String name, int empid, double salary, String department){
        super(name, empid, salary);
        this.department=department;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Test class
public class EmployeeTest {
    public static void main(String[] args) {
        // Creating an Employee object
        Employee emp1 = new Employee("Harshit", 100, 50000);
        System.out.println("Before Salary Increase:");
        emp1.displayInfo();

        // Increasing salary
        emp1.increaseSalary(10); // Increase by 10%
        System.out.println("\nAfter Salary Increase:");
        emp1.displayInfo();

        // Creating a Manager object
        System.out.println("\nCreating Manager Object:");
        Manager mgr1 = new Manager("Harshit kumar", 101, 75000, "IT");
        mgr1.displayInfo();

        // Increasing manager's salary
        mgr1.increaseSalary(15);
        System.out.println("\nAfter Salary Increase:");
        mgr1.displayInfo();
    }
}
