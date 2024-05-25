import java.util.Scanner;

public class E7_2 {
    public static void main(String[] args) {
        int[] values = new int[10];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            values[i] = scanner.nextInt();
        }
        System.out.println("Every element at an even index: ");

        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0) {
                System.out.println(values[i]);
            }
        }

        System.out.println("Every even element: ");

        for(int i=0; i < 10; i++) {
            if(values[i] % 2 ==0) {
                System.out.println(values[i]);
            }
        }

        System.out.println("All elements in reverse order: ");

        for(int i = 9; i >= 0; i--) {
            System.out.println(values[i]);
        }

        System.out.println("Only the first and last element: ");

        System.out.println("First element: " + values[0]);

        System.out.println("Last element: " + values[9]);

    }
}
