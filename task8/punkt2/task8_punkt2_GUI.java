import javax.swing.*;
import java.awt.*;

public class task8_punkt2_GUI extends JComponent {

    Image jack = new ImageIcon("src/cajer.jpg").getImage();
    task8_punkt2_GUI() {
        this.setPreferredSize(new Dimension(500, 500));

    }
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        gr.drawImage(jack, 0, 0, 500, 500, null);

    }

}
