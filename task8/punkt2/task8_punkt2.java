import javax.swing.*;
import java.awt.*;

public class task8_punkt2 extends JComponent {
    JFrame jf = new JFrame("TEST");
    task8_punkt2_GUI task;


    task8_punkt2() {


        task = new task8_punkt2_GUI();

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.add(task);

        jf.pack();
        jf.setLayout(null);
        jf.setVisible(true);
    }

    public static void main(String[] args) {

        new task8_punkt2();
    }
}

