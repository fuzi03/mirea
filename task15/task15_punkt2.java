//Прежде всего, в работе с серединой списка. Вставка и удаление в середину LinkedList устроены гораздо проще, чем в ArrayList. Мы просто переопределяем ссылки соседних элементов, а ненужный элемент “выпадает” из цепочки ссылок.
//
//В то время как в ArrayList мы:
//проверяем, хватает ли места (при вставке)
//если не хватает — создаем новый массив и копируем туда данные (при вставке)
//удаляем/вставляем элемент, и сдвигаем все остальные элементы вправо/влево (в зависимости от типа операции). Причем сложность этого процесса сильно зависит от размера списка. Одно дело — скопировать/сдвинуть 10 элементов, и совсем другое — сделать то же самое с миллионом элементов.
//То есть, если в твоей программе чаще происходят операции вставки/удаления с серединой списка, LinkedList должен быть быстрее, чем ArrayList.
import java.util.LinkedList;

public class task15_punkt2 {

    public static void main(String[] args) {

        String str1 = new String("Hello World!");
        String str2 = new String("My name is Earl");
        String str3 = new String("I love Java");
        String str4 = new String("I live in Moscow");

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(1, str3);

        System.out.println(earlBio);
        System.out.println(earlBio.get(0) + "\n");
        earlBio.addFirst(str4); // добавляет элемент в начало списка
        earlBio.addLast(str4); // в конец списка
        System.out.println(earlBio + "\n");
        System.out.println(earlBio.peekFirst());

    }
}
