import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyPanel panel;
    ImageIcon icon = new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Pictures\\Saved Pictures\\flaticon\\love.png");

    MyFrame(){
        panel = new MyPanel();
        this.add(panel);
        this.setIconImage(icon.getImage());
        this.setTitle("Lovely Message");
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
    }
}
