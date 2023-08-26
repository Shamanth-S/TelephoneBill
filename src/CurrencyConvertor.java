import java.util.Scanner;

public class CurrencyConvertor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the amount in Indian Rupees (INR): ");
        double INR = in.nextDouble();

        double rateUSD = 0.014;   // 1 INR = 0.014 USD
        double rateEUR = 0.012;   // 1 INR = 0.012 EUR
        double rateAED = 0.051;   // 1 INR = 0.051 AED
        double rateJPY = 1.49;    // 1 INR = 1.49 JPY
        double rateGBP = 0.011;   // 1 INR = 0.011 GBP

        double amtUSD = convert(INR, rateUSD);
        double amtEUR = convert(INR, rateEUR);
        double amtAED = convert(INR, rateAED);
        double amtJPY = convert(INR, rateJPY);
        double amtGBP = convert(INR, rateGBP);

        System.out.println("Converted amts:");
        System.out.println("USD: " + amtUSD);
        System.out.println("EUR: " + amtEUR);
        System.out.println("AED: " + amtAED);
        System.out.println("JPY: " + amtJPY);  
        System.out.println("GBP: " + amtGBP);
        in.close();
    }

    private static double convert(double amt, double exchangeRate) {
        return amt * exchangeRate;
    }
}
