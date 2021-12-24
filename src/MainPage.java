import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPage {
    private JButton pollButton;
    private JLabel label;
    public JPanel MainPanel;

    public MainPage(int n) {
        Main m = new Main(n);
        pollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int temp = m.poll();
                if(temp != 0){
                    JOptionPane.showMessageDialog(null,"The next lucky person is number "+temp+" !");
                    label.setText(label.getText() + (temp) + " ");

                } else {
                    JOptionPane.showMessageDialog(null,"Done!");
                }

            }
        });
    }
}
