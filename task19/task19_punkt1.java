//IllegalArgumentException

import java.util.ArrayList;
import java.util.Scanner;

public class task19_punkt1 {

    static ArrayList<Long> arr = new ArrayList<>();


    public static void base_inn(long inn, String name) {
        if (arr.contains(inn)) {
            System.out.println("Вы успешно купили " + name);
        }
        else {
            throw new IllegalArgumentException("Wrong is INN");
        }
    }
    public static void main(String[] args) {
        //представим, что у нас уже есть база с INN
        arr.add(321321321221L);
        arr.add(137129469185L);
        arr.add(458724718947L);
        arr.add(174916413649L);
        arr.add(312748915139L);
        arr.add(147174092174L);
        arr.add(634141284722L);
        Scanner sc = new Scanner(System.in);

        System.out.println("Что желаете купить?");
        System.out.println("1) Купить laptop");
        System.out.println("2) Купить Телевизор");
        System.out.println("3) Купить smart watch");
        System.out.println("4) Купить telephone Samsung");
        System.out.println("5) Купить iPhone");
        System.out.println("6) Купить instruction for TV");
        System.out.println("7) Купить coffe");
        System.out.println("8) Купить card");
        System.out.println("9) Купить BMW keys");
        int action = sc.nextInt();
        System.out.println("Авторизуйтесь, чтобы мы смогли вас идентифицировать!");
        System.out.println("Введите INN");
        long inn = sc.nextLong();

        System.out.println("Surname");
        String sn = sc.nextLine();
        sn = sc.nextLine();
        //Делаем задержку для обработки авторизации (это абсолютно не нужно, просто решил немного включить фантазию)
        System.out.println("Подождите 3 сек, идёт авторизация ...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        switch (action) {

            case 1: String laptop = "laptop"; base_inn(inn, laptop); break;
            case 2: String tv = "Телевизор"; base_inn(inn, tv); break;
            case 3: String sw = "smart watch"; base_inn(inn, sw); break;
            case 4: String ts = "telephone Samsung"; base_inn(inn, ts); break;
            case 5: String iPhone = "iPhone"; base_inn(inn, iPhone); break;
            case 6: String ins_tv = "instruction for TV"; base_inn(inn, ins_tv); break;
            case 7: String coffe = "coffe"; base_inn(inn, coffe); break;
            case 8: String card = "card"; base_inn(inn, card); break;
            case 9: String bmw = "BMW keys"; base_inn(inn, bmw); break;
            default: System.out.println("There is no such command!");
        }


    }
}