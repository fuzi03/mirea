package pract28;

import java.util.Scanner;

public class CreditPaymentStrategy implements PaymentStrategy{
    public void askData() {
        System.out.println("Введите данные кредитной карты");
        Scanner sc=new Scanner(System.in);
        int number, year, month, cvv;
        System.out.print("Введите номер карты: ");
        number=sc.nextInt();
        System.out.println("Введите срок действия карты");
        System.out.print("Месяц: ");
        month=sc.nextInt();
        System.out.print("Год: ");
        year=sc.nextInt();
        System.out.print("Введите CVV: ");
        cvv=sc.nextInt();
        System.out.println("Введите \"Подтвердить\", чтобы подтвердить покупку");
        String agreement=sc.next();
        if (agreement.equals("Подтвердить")){
            System.out.println("Заказ оформлен. Благодарим за покупку");
        }
        else {
            System.out.println("Оплата не подтверждена.");
        }
    }
}
