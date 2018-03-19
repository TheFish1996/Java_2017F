/**
 *
 * @author Jonathan
 */

package session07;
import javax.swing.*;    //used to import JFrame
import java.awt.*;       //import container properties
import java.awt.event.*;


public class GUIReview extends JFrame {
 /*  setSize
    setLayout (GridLayout)
    
    Font (set font)
    setBackground
    JButton
    JMenuBar
    JMenu
    JMenuItem
    JTextField (set text, get text)     
    JPanel
    Action listener
   
 */  
    
    private JTextField fiel;
            
   public GUIReview(){
       
       Font myfont1 = new Font("Helvetica",Font.PLAIN, 20);   // creates a new font
       
       super.setSize(600,1000);                  // sets the size, length and height
       setTitle("GUI Review");            // sets the title of the frame
       
       JMenuBar men = new JMenuBar();     // created a new menu bar to the frame
       setJMenuBar(men);                  // sets the menu bar
       
       JMenu test = new JMenu ("Review"); //creates a new menu
       JMenuItem a = new JMenuItem("1");  // creates new Menu items to be added to the menu
       JMenuItem b = new JMenuItem("2");
       JMenuItem c = new JMenuItem("quit");
       c.addActionListener(new Quit());   // adds action listener to the menu item quit
       
       test.add(a);     // adds the menu items
       test.add(b);
       test.add(c);
       
       men.add(test);                     // adds menu to menu bar
       
       
       Container help = new Container();  // creates a new container to fit area in
       help.setLayout(new GridLayout(1, 3, 2, 2)); // sets the layout of this specific container to have a grid style layout with 1 row and 3 columns with a vertgap of 2 and horizgap of 2 
       
       JButton f = new JButton("I");         // creates buttons with set font
       f.setFont(myfont1);
       JButton f1 = new JButton("Love");
       f1.setFont(myfont1);
       JButton f2 = new JButton("You");
       f2.setFont(myfont1);
       f2.addActionListener(new Change());
       
       help.add(f);           // adds buttons to the container with the set grid layout
       help.add(f1);
       help.add(f2);
       
       
       
       Container d = getContentPane();    // gets the entire window pain
       d.setBackground(Color.yellow);  //sets the background color
       
       fiel = new JTextField("Starting text");     // creates a text field with this starting text that is editable
       JPanel pan = new JPanel();                  // creates a new panel
       JLabel lab = new JLabel("testing text");                  // creates a new label with set text
       
       d.add(BorderLayout.NORTH, help); // adds the container help to the container d at the North since no layout was specified for this container or for the frame
       d.add(BorderLayout.CENTER, fiel);
       d.add(BorderLayout.EAST,pan);
       d.add(BorderLayout.SOUTH, lab);
       
       
       setVisible(true);                     // always need to put this
   }         
            
    
    public static void main(String [] args){
        
        new GUIReview();
        
        
        
    }
    
    
    class Quit implements ActionListener {
        
        
        public void actionPerformed(ActionEvent e){
            
            System.exit(0);                
        }
       
    }
    
    
    class Change implements ActionListener {
        
        public void actionPerformed (ActionEvent e){
            
            String s = fiel.getText();           // gets the text in the selected textfield
            System.out.println(s);
            
            fiel.setText("i love suneel");      // sets the text in the selected field
            
            
            
        }
        
    }
    
}
