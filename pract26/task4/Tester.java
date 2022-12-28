package pract26.task4;

import java.util.HashMap;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Parser p = new Parser(s);
        System.out.println(p.getPrefix());
        System.out.println("������� ��������� ��������:\n��� ����������\n��������\n...\nend - ����� �����");
        HashMap<String, Double> m = new HashMap<>();
        while(!(s = sc.nextLine()).equals("end")){
            m.putIfAbsent(s, sc.nextDouble());
            sc.nextLine();
        }
        try{
            System.out.println(p.calc(m));

        }catch (VariableNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
