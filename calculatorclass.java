class calculatorclass {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add two double numbers
    public double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        calculatorclass calc = new calculatorclass();

        // Testing overloaded add() methods
        System.out.println("Sum of 5 and 10 (int): " + calc.add(5, 10));
        System.out.println("Sum of 3.5 and 2.5 (double): " + calc.add(3.5, 2.5));
        System.out.println("Sum of 1, 2, and 3 (int): " + calc.add(1, 2, 3));
    }
}
