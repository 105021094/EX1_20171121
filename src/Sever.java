import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;

public class Sever extends JFrame {
    private InetAddress ipAdr;
    private ServerSocket sSocket;
    private PrintStream outStream;
    private BufferedReader inStream;
    private  SFrame sFrm;

    public Sever(SFrame serverFrm){
        sFrm = serverFrm;
        try{
            ipAdr = InetAddress.getLocalHost();
            sSocket = new ServerSocket(1723);
        }catch (UnknownHostException e){
            JOptionPane.showMessageDialog(null,"error"+e.toString());
        }catch (IOException ieo){
            JOptionPane.showMessageDialog(null,"error"+ieo.toString());
        }
    }
    public void run(){
        try{
            socket = sSocket.accept();
        }
    }
}
