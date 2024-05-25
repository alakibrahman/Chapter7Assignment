import java.util.Scanner;

public class E7_6 {
    public static void main(String[] args) {
        int[] values = new int[10];

        int sum = 0;

        int differ;

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            values[i] = in.nextInt();
        }

        for(int i = 0; i < 10-1; i++) {
            if (i % 2 == 0) {
                differ = values[i] - values[i + 1];

                sum += differ;
            }
        }

        System.out.println("sum is: " + sum);

    }
}
