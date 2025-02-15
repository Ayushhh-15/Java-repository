class course {
    String courseName;
    String courseCode;

    // Constructor using 'this' keyword
    public course(String courseName, String courseCode) {
        this.courseName = courseName; // 'this' differentiates instance variable from parameter
        this.courseCode = courseCode;
    }

    // Method to display course details
    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }

    public static void main(String[] args) {
        // Creating an object of Course class
        course course1 = new course("Data Structures", "CS101");
        course course2 = new course("Database Management", "CS102");

        // Displaying course details
        course1.displayCourse();
        System.out.println();
        course2.displayCourse();
    }
}
