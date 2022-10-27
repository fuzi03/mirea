import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class task13_punkt2_main {
    public static void main(String[] args) {
        List<task13_punkt2> task = new ArrayList<>();

        task13_punkt2 Student1 = new task13_punkt2("Stephan", 4);
        task13_punkt2 Student2 = new task13_punkt2("Olivia", 3);
        task13_punkt2 Student3 = new task13_punkt2("Andrey", 5);

        task.add(Student1);
        task.add(Student2);
        task.add(Student3);

        Comparator score = new task13_punkt2_Student();
        Collections.sort(task, score);
        for (task13_punkt2 tasks : task) {
            System.out.println(tasks);
        }
    }
}
