package E7_20;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number of values: ");

        int numValues = in.nextInt();

        int[] values = new int[numValues];

        for(int i = 0; i < numValues; i++) {
            System.out.println("Enter value " + (i + 1) + ": ");
            values[i] = in.nextInt();
        }
        int maxValue = 0;

        for(int value : values) {
            if(value > maxValue) {
                maxValue = value;
            }
        }
        for(int i = 0; i < numValues; i++) {

            int scaledValue = (int) (values[i] * 10.0 / maxValue);

            for (int j = 0; j < scaledValue; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
