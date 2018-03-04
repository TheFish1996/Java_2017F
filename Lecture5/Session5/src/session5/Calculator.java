/**
 *
 * @author Jonathan
 */

package session5;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame {
    private Font myFont1 = new Font("Serif", Font.PLAIN, 50);
    JFrame frame;
    
    Calculator (){
        setTitle("Calculator");
        setSize(700,1000);
        AddButton a = new AddButton(); // creates a new instance of button class
        
        

        JPanel n = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        n.setPreferredSize(new Dimension(700,100));

        n.add(a.OneRet());
         
         
        getContentPane().add(BorderLayout.NORTH,n);
        
        
    //    Container c = getContentPane();
          Container c = new Container();
          c.setLayout(new GridLayout(6,8,2,2));
        getContentPane().add(c);

        
        
        
        c.add(a.dble());
        c.add(a.square());
        c.add(a.percent());
        c.add(a.blank());
        c.add(a.Div());
        c.add(a.MRC());
        c.add(a.Mone());
        c.add(a.Mtwo());
        c.add(a.blank());
        c.add(a.Mult());
   
        c.add(a.Seven());
        c.add(a.Eight());
        c.add(a.Nine());
        
        c.add(a.blank());
        c.add(a.Subtr());
        
        c.add(a.Four());
        c.add(a.Five());
        c.add(a.Six());
        
        c.add(a.blank());
        c.add(a.Addition());
        
        c.add(a.One());
        c.add(a.Two());
        c.add(a.Three());
        
        c.add(a.blank());
        c.add(a.Equals());
        c.add(a.on());
        c.add(a.Zero());
        c.add(a.Dot());
        c.add(a.blank());
        c.add(a.Equals());
        
  
        
        
        setVisible(true);
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
        double var = 0;
        JButton a = new JButton("ON/C");
        a.setFont(myFont);
        a.setBackground(Color.red);
        a.setForeground(Color.white);
        a.addActionListener(new Listener(var));
        
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
    
    
     public JLabel OneRet(){
 
       return OneRet;  
     }
     
     public JButton One(){              // One
        double var = 1;
        JButton a = new JButton("1"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);
        a.addActionListener(new Listener(var));
 
 
       
 
 
     return a;
     }
     
     public JButton Two(){              // Two
        double var = 2;
        JButton a = new JButton("2"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);
        a.addActionListener(new Listener(var));
     
     
 
     return a;
     }
     
     public JButton Three(){              // 3
        double var = 3;
        JButton a = new JButton("3"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);
        a.addActionListener(new Listener(var));
    
       
 
     return a;
     }
     
     public JButton Four(){              // 4
        double var = 4;
        JButton a = new JButton("4"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);
        a.addActionListener(new Listener(var));
    
       
 
     return a;
     }
     
     public JButton Five(){              // 5
        double var = 5;
        JButton a = new JButton("5"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);
        a.addActionListener(new Listener(var));
   
      
 
     return a;
     }
     
     public JButton Six(){              // 6
        double var = 6;
        JButton a = new JButton("6"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);
        a.addActionListener(new Listener(var));
    
 
     return a;
     }
     

    public JButton Seven(){              // 7
        double var = 7;
        JButton a = new JButton("7"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);
        a.addActionListener(new Listener(var));
    
   
 
     return a;
     }
    
    public JButton Eight(){              // 8
        double var = 8;
        JButton a = new JButton("8"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);
        a.addActionListener(new Listener(var));
  
 
     return a;
     }
    
    public JButton Nine(){              // 9
        double var = 9;
        JButton a = new JButton("9"); 
        a.setFont(myFont);
        a.setBackground(Color.white);
        a.setForeground(Color.black);
        a.addActionListener(new Listener(var));
        
        return a;
    }
   
    
    
 class Listener implements ActionListener {
  
     private double var1;
     
  Listener(double x){
     
      var1 = x;
      
      
  }
  
  public void actionPerformed(ActionEvent click) {
    
    if (OneRet.getText().isEmpty()){   
        OneRet.setFont(myFont1);
        OneRet.setText(var1 + "");   
    }
    
   
  }
  
 }
 
}
    
    
    
    
    
    
    
    
    
    




