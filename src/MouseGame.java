import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MouseGame extends JInternalFrame {
    private Container cp;
    private int num=0;
    private JLabel back=new JLabel();
    private JLabel [] mouse;
    private ImageIcon imgMouse;
    private JLabel jtf;


    public MouseGame(String title) {
        super(title, true, true, true, true);
        init();
    }

    private void init() {
        cp = this.getContentPane();
        this.setBounds(5,5,600,400);
        Icon icon=new ImageIcon("MouseHole.jpg");//第二種方法獲取相應路徑下的圖片檔案
        back.setIcon(icon);//新增圖片
        cp.add(back);
        setVisible(true);

    }
}
