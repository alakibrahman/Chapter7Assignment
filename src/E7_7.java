import java.util.Scanner;

public class E7_7 {
    public static void main(String[] args) {
        int[] valuse = new int[10];

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 10; i++) {
            valuse[i] = in.nextInt();
        }

        for(int i = 9; i >= 0; i--) {
            System.out.println(valuse[i]);
        }
    }
}
