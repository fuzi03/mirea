package task13_punkt;
import java.util.Comparator;

public class SortingStudentsByGPA implements Comparator_t{
    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Aaron", 20),
                new Student(2, "Bob", 19),
                new Student(1, "Clark", 21)
        };


        System.out.print("----------------------"+'\n');

        Comparator_t.quickSort(students,0, students.length-1);

        for(int i=0;i<students.length;i++){
            System.out.print(students[i].toString()+'\n');
        }
    }

}
