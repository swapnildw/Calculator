import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            var continueCalculation = true;
            
            while (continueCalculation) {
                System.out.println("Simple Calculator");
                System.out.println("Enter first number:");
                double num1 = scanner.nextDouble();
                System.out.println("Enter an operator (+, -, *, /):");
                char operator = scanner.next().charAt(0);
                System.out.println("Enter second number:");
                double num2 = scanner.nextDouble();
                
                double result = 0;
                boolean validOperator = true;
                
                switch (operator) {
                    case '+' -> result = num1 + num2;
                    case '-' -> result = num1 - num2;
                    case '*' -> result = num1 * num2;
                    case '/' -> {
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            System.out.println("Error: Cannot divide by zero.");
                            validOperator = false;
                        }
                    }
                    default -> {
                        System.out.println("Error: Invalid operator.");
                        validOperator = false;
                    }
                }
                
                if (validOperator) {
                    System.out.println("Result: " + result);
                }
                
                System.out.println("Do you want to perform another calculation? (yes/no):");
                String userResponse = scanner.next();
                if (!userResponse.equalsIgnoreCase("yes")) {
                    continueCalculation = false;
                }
            }
        }
        System.out.println("Calculator closed.");
    }
}
