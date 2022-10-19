import javax.swing.*;
import java.awt.*;

public class task8_punkt3 extends JComponent{
    JFrame jf = new JFrame("TEST");

    task8_punkt3() {

        jf.setSize(600,600);
        JLabel jlabel = new JLabel();
        Image image = Toolkit.getDefaultToolkit().createImage("src/3jack.gif");
        ImageIcon imageIcon = new ImageIcon(image);
        imageIcon.setImageObserver(jlabel);
        jlabel.setIcon(imageIcon);
        jf.add(jlabel);
        jf.setVisible(true);
    }

    public static void main(String[] args) {
        new task8_punkt3();
    }
}
