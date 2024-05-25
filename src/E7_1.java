import java.util.Scanner;

public class E7_1 {
    public static void main(String[] args) {

        int[] values = new int[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            values[i] = scanner.nextInt();
        }

        for(int i = 9; i >= 0; i--) {
            System.out.println(values[i] + " ");
        }
    }
}
