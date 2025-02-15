class employee {
    private static int totalEmployees = 0; // Static variable to track total employees
    private int employeeID;
    private String name;
    private String department;
    private double salary;

    // Default Constructor (Assigns Default Values)
    public employee() {
        this.employeeID = 0;
        this.name = "Not Assigned";
        this.department = "Not Assigned";
        this.salary = 0.0;
        totalEmployees++; // Increment employee count
    }

    // Parameterized Constructor (Assigns User-Defined Values)
    public employee(int employeeID, String name, String department, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
        totalEmployees++; // Increment employee count
    }

    // Getter method for salary (Encapsulation)
    public double getSalary() {
        return this.salary;
    }

    // Method to calculate and return salary
    public double calculateSalary() {
        return this.salary; // Simply returning salary for now (Can include deductions, bonuses, etc.)
    }

    // Method to display employee information
    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
        System.out.println("--------------------------");
    }

    // Static method to display the total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    public static void main(String[] args) {
        // Creating Employee objects using default and parameterized constructors
        employee emp1 = new employee();
        employee emp2 = new employee(101, "Ayush", "HR", 50000.0);
        employee emp3 = new employee(102, "Garima", "IT", 70000.0);
        employee emp4 = new employee(103, "Ishu", "Finance", 60000.0);

        // Displaying employee details
        System.out.println("Employee Details:\n");
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();
        emp4.displayEmployeeInfo();

        // Displaying total number of employees
        employee.displayTotalEmployees();
    }
}

