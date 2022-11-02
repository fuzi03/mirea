package task13_punkt;

import java.util.Comparator;
import java.util.List;

public class task13_punkt3_main {

    public static void main(String[] args) {
        List<Student> students1 = List.of(
                new Student(3, "Aaron", 20),
                new Student(2, "Bob", 19),
                new Student(1, "Clark", 19)
        );

        List<Student> students2 = List.of(
                new Student(6, "David", 20),
                new Student(5, "Edward", 19),
                new Student(4, "Frank", 19)
        );

        List<Student> students3 = new task13_punkt3_MergeList<Student>().apply(
                students1,
                students2,
                Comparator.comparingInt(Student::getIDNumber));

        for (Student student : students3) {
            System.out.println(student);
        }
    }

}
