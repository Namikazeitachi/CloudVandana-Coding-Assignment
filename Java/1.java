A. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
import java.util.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int size = scanner.nextInt();
         int[] array = new int[size];
         for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        shuffleArray(array);
        System.out.println("Shuffled Array: " + Arrays.toString(array));
    }

    private static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();
        for (int i = n - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
