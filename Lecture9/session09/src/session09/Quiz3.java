/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session09;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Jonathan
 */



public class Quiz3 extends JFrame {
    
    
    private Container cont;
    
    public Quiz3(){
        
        setSize(400,600);
        
        JButton a = new JButton("Hello");
        a.addActionListener(new MyListener());
        JButton b = new JButton("send me");
        b.addActionListener(new ActionListener(){      // this is an example of an anonymous inner class because it is editing the main class method of action performed without writing a new class
            
          public void actionPerformed(ActionEvent e){
              
              cont.setBackground(Color.red);
          }  
            
        });
     
        
        cont = getContentPane();
        cont.setBackground(Color.blue);
        
        cont.add(BorderLayout.NORTH, a);
        cont.add(BorderLayout.SOUTH, b);
       
        
        
        setVisible(true);
        
    }
    
 
    
    
  class MyListener implements ActionListener {        //inner class
      
      
      public void actionPerformed(ActionEvent e){
          
          
          cont.setBackground(Color.yellow);
          
          
      }
      
      
  }  
   
  
     public static void main (String [] args){
        
        
        new Quiz3();
        
        
        
    }
  
  
}
