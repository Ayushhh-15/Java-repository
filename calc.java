public class calc {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calc <number1> <operator> <number2>");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        String operator = args[1];
        int num2 = Integer.parseInt(args[2]);

        if (operator.equals("+")) {
            System.out.println("Sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.println("Difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.println("Product of " + num1 + " and " + num2 + " is " + (num1 * num2));
        } else {
            System.out.println("Invalid operator. Use +, -, or *.");
        }
    }
}
