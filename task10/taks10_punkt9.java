public class taks10_punkt9 {
    static int task_9(int a, int b) {
        if (a > b + 1) {
            return 0;
        }
        if (a == 0 || b == 0) {
            return 1;
        }
        return task_9(a, b - 1) + task_9(a - 1, b - 1);
    }

    public static void main(String[] args) {
        System.out.println(task_9(2, 3));

    }

}
