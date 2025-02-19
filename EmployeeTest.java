package exp5;

class Employeee {
    protected String name;
    protected int empid;
    protected double salary;

    // Default constructor
    public Employeee() {
        this.name = "Unknown";
        this.empid = 0;
        this.salary = 0.0;
    }

    // Parameterized constructor
    public Employeee(String name, int empid, double salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    // Method to return employee's name
    public String getName() {
        return name;
    }

    // Method to return employee's salary
    public double getSalary() {
        return salary;
    }

    // Method to increase salary
    public void increaseSalary(double percentage) {
        if (percentage > 0) {
            salary += salary * (percentage / 100);
        }
    }
}

// Subclass Manager
class Manager extends Employeee {
    private String department;

    // Parameterized constructor
    public Manager(String name, int empid, double salary, String department) {
        super(name, empid, salary);
        this.department = department;
    }

    // Method to return department
    public String getDepartment() {
        return department;
    }
}

// Test program
public class EmployeeTest{
    public static void main(String[] args) {
        Employeee emp = new Employeee("John Doe", 101, 50000);
        System.out.println(emp.getName() + "'s salary: $" + emp.getSalary());
        emp.increaseSalary(10);
        System.out.println("After raise, salary: $" + emp.getSalary());

        Manager mgr = new Manager("Jane Smith", 102, 75000, "IT");
        System.out.println(mgr.getName() + " manages " + mgr.getDepartment() + " department.");
        mgr.increaseSalary(15);
        System.out.println("After raise, salary: $" + mgr.getSalary());
    }
}
