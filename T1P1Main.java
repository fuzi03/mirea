import java.util.Scanner;

public class T1P1Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = in.nextInt();

        if (size < 0) { System.out.println("Incorrect input!"); return; }

        System.out.print("Enter array numbers: ");
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = in.nextInt();

        printer(arrSumFor(array, size));
        printer(arrSumWhile(array, size));
        printer(arrSumDoWhile(array, size));
    }

    private static int arrSumFor(int[] array, int size) {
        int counter = 0;
        for (int i = 0; i < size; i++)
            counter += array[i];
        return counter;
    }

    private static int arrSumWhile(int[] array, int size) {
        int counter = 0, i = 0;
        while (i < size) {
            counter += array[i];
            i++;
        }
        return counter;
    }

    private static int arrSumDoWhile(int[] array, int size) {
        int counter = 0, i = 0;
        do {
            counter += array[i];
            i++;
        } while (i < size);
        return counter;
    }

    private static void printer(int res) {
        System.out.println("Sum is: " + res);
    }
}
