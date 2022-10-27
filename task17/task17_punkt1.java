import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



// Остальные пункты также присутствуют здесь
public class task17_punkt1 {
    public void t_1(String name) {
        try(FileWriter writer = new FileWriter(name, false))
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String text = sc.nextLine();
            writer.append(text);
            writer.flush();
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
    public void t_2(String name) {
        try(FileReader reader = new FileReader(name))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                //int grad = Integer.parseInt(String.valueOf(c));
                System.out.print((char)c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    public void t_4(String name) {
        try(FileWriter writer = new FileWriter(name, true))
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите текст: ");
            String text = sc.nextLine();
            writer.append(text);
            writer.flush();
        }
        catch(IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {

        String name = "test/task17.txt";

        task17_punkt1 task = new task17_punkt1();
        System.out.println("1: Реализовать запись в файл введённой с клавиатуры информации");
        task.t_1(name);
        System.out.println("2: Реализовать вывод информации из файла на экран");
        task.t_2(name);
        System.out.println('\n' + "3: Заменить информацию в файле на информацию, введённую с клавиатуры");
        task.t_1(name);
        System.out.println("4: Добавить в конец исходного файла текст, введённый с клавиатуры");
        task.t_4(name);
        System.out.println("Result");
        task.t_2(name);




    }
}
