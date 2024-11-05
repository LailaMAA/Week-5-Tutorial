import java.util.Scanner;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the first integer: ");
            String inputA = scanner.next();
            if (inputA.equalsIgnoreCase("exit")) {
                break;  
            }

            System.out.print("Enter the second integer: ");
            String inputB = scanner.next();

            try {
                int a = Integer.parseInt(inputA); 
                int b = Integer.parseInt(inputB);
                divideNumbers(a, b); 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers.");
            }
        }

        scanner.close(); 
    }

    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;  
            System.out.println("Result: " + result);  
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");  
        }
    }
}
