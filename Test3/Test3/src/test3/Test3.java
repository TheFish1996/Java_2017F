/**
 *
 * @author Jonathan
 */

package test3;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//practice all class types

public class Test3 extends JFrame {

    private JButton a;
    private JButton b;
    private JButton c;
    private static Container cont; 
    
    public Test3(){
        
        
        setSize(600,400);
        setTitle("Test3");
        
        a = new JButton("hello");
        a.addActionListener(new ActionListener(){           //anonymouse inner class cause overriding interface actionlistener method

            public void actionPerformed(ActionEvent e){
                
                cont.setBackground(Color.BLUE);
                
            } 
         });
        
        b = new JButton("its me");
        b.addActionListener(new MyListener());
        c = new JButton("jon");
        c.addActionListener(new SecondListener());
        
        cont = getContentPane();
        cont.setBackground(Color.yellow);
        
        cont.add(BorderLayout.NORTH, a);
        cont.add(BorderLayout.EAST, b);
        cont.add(BorderLayout.SOUTH, c);
        
        
        setVisible(true);
        
        
    }
    
    public static void main (String [] args){
        
        new Test3();
        
    }
    
    
    
    class MyListener implements ActionListener{             //example of an inner class
    
    
        public void actionPerformed(ActionEvent e){
            
          double x = Math.random();
          
          if (x > 0.5){
              
             cont.setBackground(Color.GREEN);
          } else {
              
            cont.setBackground(Color.GRAY);
              
          }
                          
        }
  
    }
    
  
     static class SecondListener implements ActionListener{          // static class aka static inner class. static classes can only modify static methods or variables
                                                                      // static classes can only be written inside parent classes.
    
        public void actionPerformed(ActionEvent e){
            
          double x = Math.random();
          
          if (x > 0.5){
              
              cont.setBackground(Color.GREEN);               // cont is a static variable try editing any other variable here and it wont work
          } else {
              
            cont.setBackground(Color.GRAY);
              
          }
           
         
        }
    
  
    }
    
  
    
}
