import java.util.Random;

public class PhoneGenerator {
    public static void main(String[] args) {
        String randomName = generateRandomName();
        String randomPhoneNumber = generateRandomPhoneNumber();

        System.out.println("Random Name: " + randomName);
        System.out.println("Random Phone Number: " + randomPhoneNumber);
    }

    static String generateRandomName() {
        Random random = new Random();
        StringBuilder name = new StringBuilder();

        for (int i = 0; i < 6; i++) { // Generate a name of length 6
            char randomChar = (char) ('A' + random.nextInt(26));
            name.append(randomChar);
        }

        return name.toString();
    }

    static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder("9");

        for (int i = 0; i < 9; i++) {
            phoneNumber.append(random.nextInt(10));
        }

        return phoneNumber.toString();
    }
}
