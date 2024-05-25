import java.util.Scanner;

public class basiccalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = sc.nextDouble();

        System.out.println("Enter the operator (+, -, *, /):");
        char operator = sc.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator entered.");
                return;
        }

        System.out.println("The final result:");
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
