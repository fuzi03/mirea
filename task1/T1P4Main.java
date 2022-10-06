import java.util.Arrays;
import java.util.Random;

public class T1P4Main {

    public static void main(String[] args) {
        System.out.println("Random array [class Math]:");

        int size = (int) (Math.random() * 10);

        int[] array = mathGenerator(size);
        printerArr(array);

        Arrays.sort(array);
        printerArr(array);

        //
        System.out.println("Random array [class Random]:");
        //
        Random random = new Random();

        size = random.nextInt(1, 10);

        array = randomGenerator(size, random);
        printerArr(array);

        Arrays.sort(array);
        printerArr(array);
    }

    private static int[] randomGenerator(int size, Random random) {
        int[] tmp = new int[size];
        for (int i = 0; i < size; i++) {
            tmp[i] = random.nextInt(1, 100);
        }
        return tmp;
    }

    private static int[] mathGenerator(int size) {
        int[] tmp = new int[size];
        for (int i = 0; i < size; i++) {
            tmp[i] = (int) (Math.random() * 100);
        }
        return tmp;
    }

    private static void printerArr(int[] array) {
        for (int j : array) System.out.print(j + " ");
        System.out.println();
    }
}
