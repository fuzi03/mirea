import java.util.ArrayList;

public class task15_punkt1 {

    private String name;

    public task15_punkt1(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }

    public static void main(String[] args) {
        ArrayList<task15_punkt1> task = new ArrayList<>();

        task15_punkt1 robert = new task15_punkt1("Robert");
        task15_punkt1 omar = new task15_punkt1("Omar");
        task15_punkt1 philip = new task15_punkt1("Philip");
        task15_punkt1 test = new task15_punkt1("TEST");

        task.add(robert);
        task.add(omar);
        task.add(test);

        int position = task.indexOf(omar);
        task.remove(2); //удаляет объект под индексом 2
        System.out.println(task + "\n");
        System.out.println("Размер массива: " + task.size()); //размер массива
        System.out.println("Position Omar: " + position);
        System.out.println(task.get(0)); // хотим узнать имя под индексом 0

        task.add(1, philip); //добавляем philip в индекс 1 с смещением старого
        System.out.println(task + "\n");

        task.clear(); //очищает все элементы массива
        System.out.println(task);





    }
}
