class University {
    static String universityName = "UPES"; // Static variable (shared by all)
    String studentName; // Non-static variable (unique for each object)

    // Constructor to initialize studentName
    public University(String studentName) {
        this.studentName = studentName;
    }

    // Static method to display the university name
    public static void displayUniversity() {
        System.out.println("University Name: " + universityName);
    }

    // Non-static method to display student details
    public void displayStudent() {
        System.out.println("Student Name: " + studentName);
    }

    public static void main(String[] args) {
        // Calling static method (no object needed)
        University.displayUniversity();

        // Creating multiple student objects
        University student1 = new University("Garima");
        University student2 = new University("Ayush");

        // Displaying student details
        student1.displayStudent();
        student2.displayStudent();
    }
}
