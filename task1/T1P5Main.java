import java.util.Scanner;

public class T1P5Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number upper than 0: ");
        long x = in.nextLong();

        if (x < 0) { System.out.println("Incorrect input!"); return; }

        System.out.println("Result is: " + fact(x));
    }

    private static long fact(long x) {
        long base = 1;
        for (int i = 2; i <= x; i++) base *= i;
        return base;
    }
}
