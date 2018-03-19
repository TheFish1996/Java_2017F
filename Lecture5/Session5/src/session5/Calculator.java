/**
 *
 * @author Jonathan
 */

package session5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    private AddButton a = new AddButton();
    private Font myFont1 = new Font("Serif", Font.PLAIN, 50);
    JFrame frame;
    private JButton zero = a.Zero();
    private JButton one = a.One();
    private JButton two = a.Two();
    private JButton three = a.Three();
    private JButton four = a.Four();
    private JButton five = a.Five();
    private JButton six = a.Six();
    private JButton seven = a.Seven();
    private JButton eight = a.Eight();
    private JButton nine = a.Nine();
    private JButton CE = a.CE();
    private JButton dble = a.dble();
    private JButton percent = a.percent();
    private JButton square = a.square();
    private JButton blank = a.blank();
    private JButton blank1 = a.blank();
    private JButton blank2 = a.blank();
    private JButton blank3 = a.blank();
    private JButton blank4 = a.blank();
    private JButton blank5 = a.blank();
    private JButton equals = a.Equals();
    private JButton equals2 = a.Equals();
    private JButton MRC = a.MRC();
    private JButton Mone = a.Mone();
    private JButton Mtwo = a.Mtwo();
    private JButton div = a.Div();
    private JButton addit = a.button();
    private JButton mult = a.Mult();
    private JButton sub = a.Subtr();
    private JButton on = a.on();
    private JButton dot = a.Dot();
    
    private JLabel label = new JLabel();
    
    Calculator (){
        setTitle("Calculator");
        setSize(700,1000);
        
        

        JPanel n = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        n.setPreferredSize(new Dimension(700,100));
        n.add(label);
         
        getContentPane().add(BorderLayout.NORTH,n);
        
        
    //    Container c = getContentPane();
          Container c = new Container();
          c.setLayout(new GridLayout(6,8,2,2));
          getContentPane().add(c);

        
        one.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                AdditActionPerformed(ae);
            }
        });
        
        c.add(dble);
        c.add(square);
        c.add(percent);
        c.add(blank);
        c.add(div);
        c.add(MRC);
        c.add(Mone);
        c.add(Mtwo);
        c.add(blank1);
        c.add(mult);
   
        c.add(seven);
        c.add(eight);
        c.add(nine);
        
        c.add(blank2);
        c.add(sub);
        
        c.add(four);
        c.add(five);
        c.add(six);
        
        c.add(blank3);
        c.add(addit);
        
        c.add(one);
        c.add(two);
        c.add(three);
        
        c.add(blank4);
        c.add(equals);
        c.add(on);
        c.add(zero);
        c.add(dot);
        c.add(blank5);
        c.add(equals2);
        
  
        
        
        setVisible(true);
        
       
    }
    
    
    private void AdditActionPerformed(java.awt.event.ActionEvent evt) {                // have to deifne everything seperately
        double x = 1;
        label.setText(x + "");
    }
    
    
    
    
    public static void main (String [] args){
        new Calculator();
        
        
        
    }
    
}

class AddButton extends JFrame {
    
   private Font myFont = new Font("Serif", Font.PLAIN, 20);
   private Font myFont1 = new Font("Serif", Font.PLAIN, 50);
   private JLabel OneRet = new JLabel();
  
   
   public JButton blank(){              // add button
        JButton a = new JButton(""); 
        a.setBackground(Color.white);
        a.setForeground(Color.white);
        a.setFont(myFont);
     return a;
        
    }
   
    public JButton button(){              // add button
        JButton a = new JButton("add"); 
        a.setBackground(Color.black);
        a.setForeground(Color.white);
        a.setFont(myFont);
     return a;
        
    }
    
    public JButton on(){                 // on/c button
 
        JButton a = new JButton("ON/C");
        a.setFont(myFont);
        a.setBackground(Color.red);
        a.setForeground(Color.white);
  
        
     return a;
        
    }
    
    public JButton CE(){                // CE button
        JButton a = new JButton("CE");
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
        
     return a;
        
    }
    
    public JButton dble(){             //dble button
        JButton a = new JButton("+/-"); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
        
     return a;
        
    }
    
    public JButton square(){                 // sqrt button
        JButton a = new JButton("square root"); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;   
        
    }
    
     public JButton percent(){              // percent button
        JButton a = new JButton("%"); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;
     }
     
     public JButton MRC(){              // percent button
        JButton a = new JButton("MRC"); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;
     }
     
    public JButton Mone(){              // M-
        JButton a = new JButton("M-"); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;
     }
      
    public JButton Mtwo(){              // M+
        JButton a = new JButton("M+"); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;
     }
         
    public JButton Div(){              // division
        JButton a = new JButton("/"); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;
     }
    
    public JButton Mult(){              // Multiplication
        JButton a = new JButton("X"); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;
     }
    
    public JButton Subtr(){              // Subtraction
        JButton a = new JButton("-"); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;
     }
    
    public JButton Addition(){              // Addition
        JButton a = new JButton("+"); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;
     }
    
    
     public JButton Equals(){              // Equals
        JButton a = new JButton("="); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;
     }
     
     
     public JButton Zero(){              // 0
        JButton a = new JButton("0"); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;
     }
     
     
     
     public JButton Dot(){              // .
        JButton a = new JButton("."); 
        a.setFont(myFont);
        a.setBackground(Color.black);
        a.setForeground(Color.white);
     return a;
     }
    
    
    
     
     public JButton One(){              // One

        JButton a = new JButton("1"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);
 
 
 
       
 
 
     return a;
     }
     
     public JButton Two(){              // Two
  
        JButton a = new JButton("2"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);

     
     
 
     return a;
     }
     
     public JButton Three(){              // 3
  
        JButton a = new JButton("3"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);
  
    
       
 
     return a;
     }
     
     public JButton Four(){              // 4

        JButton a = new JButton("4"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);

    
       
 
     return a;
     }
     
     public JButton Five(){              // 5

        JButton a = new JButton("5"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);

   
      
 
     return a;
     }
     
     public JButton Six(){              // 6
     
        JButton a = new JButton("6"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);

 
     return a;
     }
     

    public JButton Seven(){              // 7
      
        JButton a = new JButton("7"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);

    
   
 
     return a;
     }
    
    public JButton Eight(){              // 8
       
        JButton a = new JButton("8"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);

 
     return a;
     }
    
    public JButton Nine(){              // 9
      
        JButton a = new JButton("9"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);

        
        return a;
    }
   
    

 
}
    
    
    
    
    
    
    
    
    
    




