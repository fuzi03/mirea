import java.util.Comparator;
import java.util.List;

public class StudentTest {

    public static void main(String[] args) {
        List<task13_punkt1.Student> students1 = List.of(
                new task13_punkt1.Student(3, "Aaron", 20, new double[] {1, 1, 1}),
                new task13_punkt1.Student(2, "Bob", 19, new double[] {2, 2, 2}),
                new task13_punkt1.Student(1, "Clark", 19, new double[] {3, 3, 3})
        );

        List<task13_punkt1.Student> students2 = List.of(
                new task13_punkt1.Student(6, "David", 20, new double[] {1, 1, 1}),
                new task13_punkt1.Student(5, "Edward", 19, new double[] {2, 2, 2}),
                new task13_punkt1.Student(4, "Frank", 19, new double[] {3, 3, 3})
        );

        List<task13_punkt1.Student> students3 = new MergeLists<task13_punkt1.Student>().apply(
                students1,
                students2,
                Comparator.comparingInt(task13_punkt1.Student::getIDNumber));

        for (task13_punkt1.Student student : students3) {
            System.out.println(student);
        }
    }

}
