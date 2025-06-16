import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter credit card number: ");
        String cardNumber = scanner.nextLine();
        scanner.close();
        if (isValidCardNumber(cardNumber)) {
            System.out.println("Valid credit card number.");
        } else {
            System.out.println("Invalid credit card number.");
        }
    }
    public static boolean isValidCardNumber(String cardNumber) {
        if (cardNumber.length() < 13 || cardNumber.length() > 16) {
            return false;
        }
        if (!(cardNumber.startsWith("37") ||
                cardNumber.startsWith("4") ||
                cardNumber.startsWith("5") ||
                cardNumber.startsWith("6"))) {
            return false;
        }
        return luhnCheck(cardNumber);
    }
    public static boolean luhnCheck(String cardNumber) {
        int nDigits = cardNumber.length();
        int sum = 0;
        boolean isSecond = false;
        for (int i = nDigits - 1; i >= 0; i--) {
            int d = cardNumber.charAt(i) - '0';
            if (isSecond)
                d = d * 2;
            sum += d / 10;
            sum += d % 10;

            isSecond = !isSecond;
        }
        return (sum % 10 == 0);
    }
}