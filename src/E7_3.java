import java.util.Scanner;

public class E7_3 {
    public static void main(String[] args) {
        int[] values = new int[10];

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            values[i] = in.nextInt();
        }

        int largest = values[0];

        int smallest = values[0];

        for(int i = 1; i < 10; i++) {
            if(largest < values[i]) {
                largest = values[i];
            }
        }

        for(int i = 1; i < 10; i++) {
            if(smallest > values[i]) {
                smallest = values[i];
            }
        }

        for(int i = 0; i < 10; i++) {
            if(largest == values[i]) {
                System.out.print(values[i] + "<== largest value");
            }

            if(smallest == values[i]) {
                System.out.print(values[i] + "<== smallest value");
            }

            else {
                System.out.println(values[i]);
            }
        }

    }
}
