import java.util.Scanner;
public class NestedExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String num1 = scanner.nextLine();
        System.out.print("Enter the second number: ");
        String num2 = scanner.nextLine();
        parseAndDivide(num1, num2); 
        scanner.close(); 
    }
    public static void parseAndDivide(String num1, String num2) {
        try {
            int number1 = Integer.parseInt(num1);
            try {
                int number2 = Integer.parseInt(num2);
                int result = number1 / number2;
                System.out.println("Result: " + result); 
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }
}
