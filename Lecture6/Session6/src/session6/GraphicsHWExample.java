
/**
 *
 * @author jojob
 */

// create a window with a file Menu (quit), an edit menu (cut,paste), and Help
package session6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class GraphicsHWExample extends JFrame {
    public GraphicsHWExample(){
       super("CAD Package");
       setSize(600,400);
       JMenuBar mb = new JMenuBar();
       setJMenuBar(mb);
       JMenu m = new JMenu("File");
       mb.add(m);
       JMenuItem mi = new JMenuItem("Quit");
       m.add(mi);
       setVisible(true);
            
        
    }
public static void main(String [] args){
    
    new GraphicsHWExample();
    
}
    

}
