import java.util.Scanner;

public class ScientificCalculator {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        int choice;
        do {
            System.out.println("Scientific Calculator");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square root");
            System.out.println("6. Sine");
            System.out.println("7. Cosine");
            System.out.println("8. Tangent");
            System.out.println("9. Exponential");
            choice = in.nextInt();

            double res = 0.0;

            switch (choice) {
                            case 1: res = add();
                                    break;
                            case 2: res = sub();
                                    break;
                            case 3: res = mul();
                                    break;
                            case 4: res = div();
                                    break;
                            case 5: res = SQRT();
                                    break;
                            case 6: res = sin();
                                    break;
                            case 7: res = cos();
                                    break;
                            case 8: res = tan();
                                    break;
                            case 9: res = e();
                                    break;
                            default: System.out.println("Invalid choice.");
                                     return;
            }

            System.out.println("Result: " + res);
            System.out.println();
            Thread.sleep(50000);
            } while (choice != 10);
            in.close();
    }

    private static double add() {
        System.out.print("Enter the first number: ");
        double n = in.nextDouble();
        System.out.print("Enter the second number: ");
        double m = in.nextDouble();
        return n + m;
    }

    private static double sub() {
        System.out.print("Enter the first number: ");
        double n = in.nextDouble();
        System.out.print("Enter the second number: ");
        double m = in.nextDouble();
        return n - m;
    }

    private static double mul() {
        System.out.print("Enter the first number: ");
        double n = in.nextDouble();
        System.out.print("Enter the second number: ");
        double m = in.nextDouble();
        return n * m;
    }

    private static double div() {
        System.out.print("Enter the numerator: ");
        double n = in.nextDouble();
        System.out.print("Enter the denominator: ");
        double m = in.nextDouble();
        if (m != 0) {
            return n / m;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }

    private static double SQRT() {
        System.out.print("Enter a number: ");
        double num = in.nextDouble();
        return Math.sqrt(num);
    }

    private static double sin() {
        System.out.print("Enter an angle in degrees: ");
        double angle = in.nextDouble();
        return Math.sin(Math.toRadians(angle));
    }

    private static double cos() {
        System.out.print("Enter an angle in degrees: ");
        double angle = in.nextDouble();
        return Math.cos(Math.toRadians(angle));
    }

    private static double tan() {
        System.out.print("Enter an angle in degrees: ");
        double angle = in.nextDouble();
        return Math.tan(Math.toRadians(angle));
    }

    private static double e() {
        System.out.print("Enter a number: ");
        double num = in.nextDouble();
        return Math.exp(num);
    }
}
