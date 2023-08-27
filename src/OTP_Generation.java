import java.util.Random;

public class OTP_Generation {
    public static void main(String[] args) {
        String phoneNumber = generateRandomPhoneNumber();
        String otp = generateOTP();

        System.out.println("Generated OTP: " + otp);
        System.out.println("Sending OTP to: " + phoneNumber);
    }

    static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder("+");

        for (int i = 0; i < 10; i++) {
            phoneNumber.append(random.nextInt(10));
        }

        return phoneNumber.toString();
    }

    static String generateOTP() {
        Random random = new Random();
        StringBuilder otp = new StringBuilder();

        for (int i = 0; i < 6; i++) { // Generate a 6-digit OTP
            otp.append(random.nextInt(10));
        }

        return otp.toString();
    }
}
