import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Simple Calculator");
        System.out.print("Enter the first number: ");
        double n = in.nextDouble();

        System.out.print("Enter the second number: ");
        double m = in.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char op = in.next().charAt(0);
        
        double res = 0.0;

        switch (op) {
            case '+':
                res = n + m;
                break;
            case '-':
                res = n - m;
                break;
            case '*':
                res = n * m;
                break;
            case '/':
                if (m != 0) {
                    res = n / m;
                } else {
                    System.out.println("Cannot divide by zero.");
                    in.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid op.");
                in.close();
                return;
        }
        
        System.out.println("Result: " + res);
        in.close();
    }
}
