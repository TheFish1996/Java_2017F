
/**
 *
 * @author jojob
 */

package session07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Clear extends JFrame{

private JMenuBar menu;
private JMenu a;
private JMenuItem clear;
private JPanel Pan;
    
public Clear(){
    
    super("Clear hw");
    setSize(600,400);
    menu = new JMenuBar();
    setJMenuBar(menu);
    
    a = new JMenu("Click");
    
    clear = new JMenuItem("Clear");
    clear.addActionListener(new MyListener());
    
    a.add(clear);
    
    
    menu.add(a);
    
    
    
    Container c = getContentPane();
    Pan = new JPanel();
    Pan.setBackground(Color.yellow);
    c.add(BorderLayout.CENTER, Pan);
    
    
    setVisible(true);
}
   
   public static void main (String [] args){
       
       new Clear();
       
       
       
   }


   class MyListener implements ActionListener {
    
    public void actionPerformed (ActionEvent ae){
        
        
        Pan.setBackground(Color.red);
        
        
        
    }
    
    
    
    
}
   
   
}
