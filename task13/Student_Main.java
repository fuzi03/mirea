package task13_punkt;

import java.util.Arrays;
import java.util.Comparator;

public class Student_Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Aaron", 20),
                new Student(2, "Bob", 19),
                new Student(1, "Clark", 21)
        };

        Arrays.sort(students, Comparator.comparingInt(Student::getIDNumber));

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
