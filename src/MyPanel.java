import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    JTextField textField;
    JButton button;
    JButton clearBtn;
    MyPanel(){
        textField = new JTextField("enter your message");
        button = new JButton("click here");
        clearBtn = new JButton("clear");

        textField.setPreferredSize(new Dimension(420, 200));
        textField.setForeground(Color.white);
        textField.setFont(new Font("MV Boli", Font.ITALIC, 20));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setBackground(Color.pink);
        textField.setCaretColor(Color.white);

        button.addActionListener(this);
        button.setPreferredSize(new Dimension(209, 50));
        button.setForeground(Color.white);
        button.setBackground(new Color(0x123456));
        button.setFont(new Font("MV Boli", Font.ITALIC, 20));
        button.setFocusable(false);

        clearBtn.addActionListener(this);
        clearBtn.setPreferredSize(new Dimension(207, 50));
        clearBtn.setForeground(Color.white);
        clearBtn.setBackground(new Color(0x123456));
        clearBtn.setFont(new Font("MV Boli", Font.ITALIC, 20));
        clearBtn.setFocusable(false);

        this.setPreferredSize(new Dimension(420, 254));
        this.add(textField);
        this.add(button);
        this.add(clearBtn);
        this.setLayout(new FlowLayout(FlowLayout.CENTER,2,1));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){
            String text = textField.getText();
            textField.setText("have a noice day " + text + " <3!");
        }

        if (e.getSource() == clearBtn){
            textField.setText("");
        }
    }
}
