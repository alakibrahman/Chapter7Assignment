package E7_19;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of values: ");

        int numValues = in.nextInt();

        int[] values = new int[numValues];

        for(int i = 0; i < numValues; i++) {
            System.out.print("enter value " + (i + 1) + ": ");
            values[i] = in.nextInt();
        }
        int maxValue = 0;
        for(int value : values) {
            if(value > maxValue) {
                maxValue = value;
            }
        }

        double scale = 40.0 / maxValue;

        for (int i = 0; i < numValues; i++) {
            int scaledValue = (int) (values[i] * scale);
            for (int j = 0; j < scaledValue; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
