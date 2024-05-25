package E7_22;

import java.util.Scanner;

public class ImprovedBarChartWithCaptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of countries: ");
        int numCountries = scanner.nextInt();

        String[] captions = new String[numCountries];
        int[] values = new int[numCountries];

        for (int i = 0; i < numCountries; i++) {
            System.out.print("Enter the name of country " + (i + 1) + ": ");
            captions[i] = scanner.next();
            System.out.print("Enter value for " + captions[i] + ": ");
            values[i] = scanner.nextInt();
        }
        int maxAbsValue = 0;
        for (int value : values) {
            int absValue = Math.abs(value);
            if (absValue > maxAbsValue) {
                maxAbsValue = absValue;
            }
        }
        double scale = 40.0 / maxAbsValue;

        for (int i = 0; i < numCountries; i++) {
            int scaledValue = (int) (Math.abs(values[i]) * scale);
            System.out.printf("%-15s ", captions[i]);
            for (int j = 0; j < scaledValue; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
