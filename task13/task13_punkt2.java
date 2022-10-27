
public class task13_punkt2 {

    private String name;
    private int a_score;

    public task13_punkt2(String name, int a_score) {
        this.a_score = a_score;
        this.name = name;
    }

    public void setA_score(int a_score) {
        this.a_score = a_score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA_score() {
        return a_score;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student {" + "Name: " + name + "," + " Score: " + a_score + "}";
    }
}


