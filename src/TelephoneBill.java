import java.util.Scanner;

class TelephoneBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the plan type (R for Regular, P for Premium): ");
        char plan = in.next().charAt(0);

        System.out.print("Enter the number of minutes: ");
        int MIN = in.nextInt();

        double total = calculate(plan, MIN);

        System.out.println("Total bill:" + total + "Rupees");
        in.close();
    }

    static double calculate(char plan, int MIN) {
        double base;
        double extra = 0.0;

        if (plan == 'R' || plan == 'r') {
            base = 10.0;
            if (MIN > 50) {
                extra = (MIN - 50) * 0.2;
            }
        } else if (plan == 'P' || plan == 'p') {
            base = 25.0;
            if (MIN > 100) {
                extra = (MIN - 100) * 0.1;
            }
        } else {
            System.out.println("Invalid plan type.");
            return 0.0;
        }

        return base + extra;
    }
}
