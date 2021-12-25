import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.DEFAULT_OPTION;

public class MainPage {
    private JButton pollButton;
    private JLabel label;
    public JPanel MainPanel;

    public MainPage(int n) {
        Main m = new Main(n);
        Icon icon = new ImageIcon("gift.jpeg");

        pollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = m.poll();
                if(temp != 0){
                    JOptionPane.showMessageDialog(null,"The next person is number "+temp+" !",null,DEFAULT_OPTION,null);
                    label.setText(label.getText() + (temp) + " ");

                } else {
                    JOptionPane.showMessageDialog(null,"Done!");
                }
            }
        });
    }

}
