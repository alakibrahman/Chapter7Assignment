import java.util.Scanner;

public class E7_4 {
    public static void main(String[] args) {
        int[] values = new int[10];

        int sum = 0;

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            values[i] = in.nextInt();

            sum += values[i];
        }

        int smallest = values[0];

        for(int i = 1; i < 10; i++) {
            if(smallest > values[i]) {
                smallest = values[i];
            }
        }

        int difference = sum - smallest;

        System.out.println("difference is: " + difference);

    }
}
