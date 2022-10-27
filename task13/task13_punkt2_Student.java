import java.util.Comparator;

public class task13_punkt2_Student implements Comparator<task13_punkt2> {

    @Override
    public int compare(task13_punkt2 o1, task13_punkt2 o2) {
        return o2.getA_score() - o1.getA_score();
    }
}
