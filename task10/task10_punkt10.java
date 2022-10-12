public class task10_punkt10 {
    static int punkt10(int n, int i) {
        if (n == 0) {
            return i;
        }
        else {

            return punkt10(n / 10, i*10 + n%10);
        }
    }

    public static void main(String[] args) {
        System.out.println(punkt10(1234, 0));
    }
}
