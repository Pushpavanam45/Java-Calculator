package elevatelab_intern;
import java.util.Scanner;

public class JavaCalculator {

    // Methods for operations
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2, result;
        char operator;

        while (true) {
            // Display menu
            System.out.println("\n=== Simple Calculator ===");
            System.out.println("1. Calculation");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                // Take inputs
                System.out.print("Enter first number: ");
                num1 = scanner.nextDouble();

                

                System.out.print("Enter second number: ");
                num2 = scanner.nextDouble();
                System.out.print("Enter operator (+, -, *, /): ");
                operator = scanner.next().charAt(0);

                // Perform calculation using methods
                switch (operator) {
                    case '+':
                        result = add(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case '-':
                        result = subtract(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case '*':
                        result = multiply(num1, num2);
                        System.out.println("Result: " + result);
                        break;
                    case '/':
                        result = divide(num1, num2);
                        if (!Double.isNaN(result)) {
                            System.out.println("Result: " + result);
                        }
                        break;
                    default:
                        System.out.println("Invalid operator!");
                }
            } else if (choice == 2) {
                System.out.println("Exiting !!!");
                break;
            } else {
                System.out.println("Invalid choice! Please enter 1 or 2.");
            }
        }

        scanner.close();
    }
}
