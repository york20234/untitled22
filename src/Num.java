import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Num extends JFrame {
    private Container cp;
    private String str[] = {"7", "8", "9", "4", "5", "6", "1", "2", "3", "0", "00", "000"};
    private JButton jbtns[] = new JButton[12];



    public Num (){
        init();
    }

    private void init() {
        cp = this.getContentPane();
        cp.setLayout(new GridLayout(4, 3, 3, 3));
        this.setSize(400, 400);
        this.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);


        for (int i=0;i<12;i++){
            jbtns[i]=new JButton(str[i]);
            cp.add(jbtns[i]);
            jbtns[i].setFont(new Font(null,Font.PLAIN,40));

        }

    }
}
