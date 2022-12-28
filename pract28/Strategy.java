package pract28;

import pract28.CreditPayment;
import pract28.EPayment;
import pract28.Payment;

import java.util.Scanner;

public class Strategy {

    public static int InputMenu() {
        int menu;
        System.out.println("�������� ������ ������");
        System.out.println("1 - ����������� �������");
        System.out.println("2 - ��������� �����");
        System.out.println("0 - �����");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("������� ����� �� 0 �� 2: ");
            if (scanner.hasNextInt()) {
                menu = scanner.nextInt();
                if (menu >= 0 && menu <= 2) {
                    return menu;
                } else {
                    System.out.println("����� ��� ����������� ��������� ��������. ��������� ����.");
                }
            } else {
                System.out.println("�������� ����, ���������.");
                scanner.next();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("���������� ������");
        int menu = -1;
        menu = InputMenu();
        if (menu == 0) {
            System.out.println("�����...");
        }
        switch (menu) {
            case 1: {
                Payment epayment = new EPayment();
                epayment.askData();
                break;
            }
            case 2: {
                Payment creditpayment = new CreditPayment();
                creditpayment.askData();
                break;
            }
            default: {
                break;
            }
        }
    }
}