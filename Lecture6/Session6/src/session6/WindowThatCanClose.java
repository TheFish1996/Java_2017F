
/**
 *
 * @author jojob
 */

package session6;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WindowThatCanClose extends JFrame {

    public WindowThatCanClose(){
       setSize(800,400);
       Container c = getContentPane();
       JButton b = new JButton("ok");
       c.add(BorderLayout.CENTER, b);
       addWindowListener(new MyWindowListener());
       b.addActionListener(new MyListener());
       setVisible(true);
        
        
    }
    
    public static void main (String [] args){
    new WindowThatCanClose();    
        
        
    }
}



class MyListener implements ActionListener  {
  public void actionPerformed(ActionEvent e) {
      System.out.println("yo");
      
  }
    
}

class MyWindowListener implements WindowListener {

    @Override
    public void windowOpened(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent we) {
       System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowIconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}