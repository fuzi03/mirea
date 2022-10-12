import java.util.Scanner;
import java.util.*;
public class task10_punkt7 {
    static void punkt7(int n, int k) {
        if (k > n/2) {
            System.out.print(n + " ");
            return;
        }
        if (n % k == 0) {
            System.out.print(k + " " + n + "\n");
            punkt7(n / k, k);
        }
        else {
            punkt7(n, ++k);
        }
    }

    public static void main(String[] args) {
        punkt7(120, 2);

    }
}
