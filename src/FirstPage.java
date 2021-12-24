import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class FirstPage {
    private JButton goButton;
    private JTextField numField;
    private JPanel MainPanel;
    public int num;

    public FirstPage() {
        goButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num = Integer.parseInt(numField.getText());
                System.out.println(num);
                JFrame frame2 = new JFrame();
                frame2.setContentPane(new MainPage(num).MainPanel);
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setBounds(600,600,num*50,300);
                frame2.setVisible(true);
            }
        });
    }

    public void getNum(){
         num = Integer.parseInt(numField.getText());
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("APP");
        FirstPage fp = new FirstPage();
        frame.setContentPane(fp.MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(600,600,400,300);
        frame.setVisible(true);
    }

}
