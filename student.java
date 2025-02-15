class Student {
    String name;
    int age;

    // Default constructor
    public Student() {
        this.name = "Default Name";
        this.age = 18;
    }

    // Parameterized constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }

    public static void main(String[] args) {
        // Creating an object using the default constructor
        Student student1 = new Student();
        System.out.println("Default Constructor Output:");
        student1.display();

        // Creating an object using the parameterized constructor
        Student student2 = new Student("Ayush Rawat", 21);
        System.out.println("\nParameterized Constructor Output:");
        student2.display();
    }
}
