
/**
 *
 * @author jojob
 */

package session4;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SwingDemo1 {


    public static void main (String[] args){
    JFrame f = new JFrame();
    f.setSize(1000,700);
    JButton b = new JButton("ok");
    b.addActionListener(new MyListener());
    Container c = f.getContentPane(); //stores everrything on c
    c.add(BorderLayout.NORTH, b); //adds button b to container c
    f.setVisible(true);
    
    }
}

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e){
        System.out.println("yo");
        
    }
    
    
    
}