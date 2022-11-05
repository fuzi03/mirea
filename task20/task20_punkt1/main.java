package task20.task20_punkt1;

import java.util.List;

public class main {
    public static void main(String[] args) {
        ConvertList cl = new ConvertList();
        Integer[] number = new Integer[] {1, 2, 3, 4, 5};
        List<Integer> list1 = cl.convertToList(number);

        String[] string = new String[] {"Death", "Zero", "Lock"};
        List<String> list2 = cl.convertToList(string);

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);



    }
}
