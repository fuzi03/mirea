import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class task9_punkt1 implements ActionListener{
    JFrame jf = new JFrame("TEST");
    JButton jb = new JButton("Нажми для создания фигур ^_^");

    task9_punkt1() {
        jb.setBounds(100, 200, 300, 20);
        jb.addActionListener(this);
        jb.setFocusPainted(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(500, 500);
        jf.add(jb);
        jf.setLayout(null);
        jf.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == jb) {
            jf.dispose();
            task8_punkt1 task = new task8_punkt1();
        }
    }

    public static void main(String[] args) {
        task9_punkt1 task2 = new task9_punkt1();
    }
}

