/**
 * A sample class that we'll modify later to utilize commons to connect to SFTP
 * Servers
 * 
 * original example based off of https://www.javatpoint.com/java-swing
 */
import javax.swing.*;

public class JavaSwingExample {
    static int width = 400;
    static int height = 500;
    public static void main(String[] args) {  
        JFrame f=new JFrame();//creating instance of JFrame  
                
        JButton b=new JButton("click");//creating instance of JButton  
        b.setBounds(f.getWidth() - 110,f.getHeight() - 50 ,100, 40);//x axis, y axis, width, height  
         b.setBounds(290, 425 ,100, 40);//x axis, y axis, width, height        
        f.add(b);//adding button in JFrame  
                
        f.setSize(width ,height);//400 width and 500 height  
        f.setLayout(null);//using no layout managers  
        f.setVisible(true);//making the frame visible  
    }  
    
}