import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        // Exchange rates
        double USDToEuroRate = 0.85;
        double USDToPoundRate = 0.73;
        double USDToYenRate = 110.23;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter amount in USD: ");
        double amountInUSD = scanner.nextDouble();

        System.out.println("Choose currency to convert to:");
        System.out.println("1. Euro");
        System.out.println("2. British Pound");
        System.out.println("3. Japanese Yen");

        int choice = scanner.nextInt();

        double convertedAmount = 0;

        switch (choice) {
            case 1:
                convertedAmount = convertCurrency(amountInUSD, USDToEuroRate);
                System.out.printf("%.2f USD is %.2f Euro\n", amountInUSD, convertedAmount);
                break;
            case 2:
                convertedAmount = convertCurrency(amountInUSD, USDToPoundRate);
                System.out.printf("%.2f USD is %.2f British Pound\n", amountInUSD, convertedAmount);
                break;
            case 3:
                convertedAmount = convertCurrency(amountInUSD, USDToYenRate);
                System.out.printf("%.2f USD is %.2f Japanese Yen\n", amountInUSD, convertedAmount);
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    private static double convertCurrency(double amount, double exchangeRate) {
        return amount * exchangeRate;
    }
}
