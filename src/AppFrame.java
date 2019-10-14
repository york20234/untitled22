import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame extends JFrame {
    private Container cp;
    private JMenuBar jmbar= new JMenuBar();
    private JMenu jmFile= new JMenu("File");
    private JMenuItem exit =new JMenuItem("Exit");
    private JMenuItem jmiLogout=new JMenuItem("Logout");
    private Window loginFrame;


    public AppFrame(Window login){
        loginFrame=login;
        init();
    }
    private void init(){
        cp=this.getContentPane();
        this.setSize(500,500);
        this.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
        this.setJMenuBar(jmbar);
        jmbar.add(jmFile);
        jmFile.add(exit);
        jmFile.add(jmiLogout);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
        jmiLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AppFrame.this.setVisible(false);
                AppFrame.this.dispose();
                loginFrame.resetData();
                loginFrame.setVisible(true);
            }
        });
    }
}
