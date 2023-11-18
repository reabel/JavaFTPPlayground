/**
 * A sample class that we'll modify later to utilize commons to connect to SFTP
 * Servers
 * 
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class FTPMain extends JPanel {
    static int width = 400;
    static int height = 500;
    protected JTextField userField;
    protected JPasswordField passField;
    protected JTextArea folders;

    public FTPMain() {
        super(new GridBagLayout());

        userField = new JTextField(20);
        passField = new JPasswordField(20);
        folders = new JTextArea(5, 20);
        JScrollPane scrollPane = new JScrollPane(folders);
        
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
 
        c.fill = GridBagConstraints.HORIZONTAL;
        add(userField, c);
        add(passField, c);
 
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane, c);
    }
    public static void main(String[] args) {  
        JFrame f=new JFrame("FTPMain");//creating instance of JFrame  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new FTPMain());
        //JButton b=new JButton("click");//creating instance of JButton
        

        // b.setBounds(f.getWidth() - 110,f.getHeight() - 50 ,100, 40);//x axis, y axis, width, height  
        //b.setBounds(290, 425 ,100, 40);//x axis, y axis, width, height        
        //f.add(b);//adding button in JFrame  ;
                
        //f.setSize(width ,height);//400 width and 500 height  
        //f.setLayout(null);//using no layout managers
        f.pack();
        f.setVisible(true);//making the frame visible  
    }  
    
}