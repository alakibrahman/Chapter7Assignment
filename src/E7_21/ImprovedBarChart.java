package E7_21;

import java.util.Scanner;

public class ImprovedBarChart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of values: ");
        int numValues = scanner.nextInt();

        int[] values = new int[numValues];
        for (int i = 0; i < numValues; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
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

        for (int i = 0; i < numValues; i++) {
            int scaledValue = (int) (Math.abs(values[i]) * scale);
            for (int j = 0; j < scaledValue; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
