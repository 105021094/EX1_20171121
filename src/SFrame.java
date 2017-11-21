import javax.swing.*;
import java.awt.*;

public class SFrame extends JFrame {
    private JButton jbtnRun = new JButton("Start");
    private JButton jbtnExit = new JButton("Exit");
    private JButton jbtnSend = new JButton("Send");
    private JTextArea jta = new JTextArea();
    private JTextArea jtaOut = new JTextArea();
    private  JScrollPane jsp = new JScrollPane(jta);
    private  JScrollPane jspOut = new JScrollPane(jtaOut);
    private JPanel jpnBottom = new JPanel(new BorderLayout(5,5));

    private JPanel jpnFunction = new JPanel(new GridLayout(5,1,5,5));
    private JLabel jlbStatus = new JLabel("Status");
    private Container cp;
    private Sever serv;

    public SFrame(){
        initComp();
    }
}
