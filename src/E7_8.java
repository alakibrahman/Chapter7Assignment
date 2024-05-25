import java.util.Arrays;
import java.util.Random;

public class E7_8 {
    public static void main(String[] args) {
        int[] secondArray = new int[10];
        int[] permutationArray = new int[10];

        for (int i = 0; i < 10; i++) {
            secondArray[i] = i + 1;
        }

        Random random = new Random();

        for (int permIndex = 0; permIndex < 10; permIndex++) {
            for (int i = 9; i >= 0; i--) {
                int randomPosition = random.nextInt(i + 1);

                int temp = secondArray[i];

                secondArray[i] = secondArray[randomPosition];

                secondArray[randomPosition] = temp;
            }
            permutationArray[permIndex] = secondArray[0];
        }

        System.out.println("Random Permutation: ");

        System.out.println(Arrays.toString(permutationArray));
    }
}
