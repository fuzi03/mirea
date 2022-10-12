public class task10_punkt11 {
    static int task_11() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    if (n == 1) {
      int m = in.nextInt();
      if (m == 1) {
        return task_11() + n + m;
      } else {
        int k = in.nextInt();
        if (k == 1) {
          return task_11() + n + m + k;
        } else {
          return n + m + k;
        }
      }
    } else {
      int m = in.nextInt();
      if (m == 1) {
        return task_11() + n + m;
      } else {
        return n + m;
      }
    }
	public static void main(String[], args) {
		System.out.println("11) Количество единиц. Дана последовательность натуральных чисел (одно число в строке), завершающаяся двумя числами 0 подряд. Определите, сколько раз в этой последовательности встречается число 1.");
		System.out.println("  Введи числа: ");
		System.out.print("  Результат: " + task_11());
	} 
  }
}
