/**
 *
 *  Author: Jonathan Fishkin
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class TextEdit extends JFrame {
      
     private JMenuBar jmb;
     private JMenu menu;
     private JButton quit;
     private JMenuItem saving; 
     private JMenuItem loading;
     private JTextArea text;
     private JButton Cut;
     private JButton Copy;
     private JButton Paste;
     private String textSel;
     private String prevText;
     private int startpos;
     private int endpos;
     Font val = new Font("Helvetica",Font.PLAIN, 30 );
     Font val1 = new Font("Helvetica",Font.PLAIN, 20 );

    
    
    TextEdit(){

       
      
       
       setTitle("Text Editor");
       setSize(600,600);
       
       quit = new JButton("Quit");
       quit.setBackground(Color.WHITE);
       quit.setFont(val1);
       quit.addActionListener(new CloseWindow());
       
       jmb = new JMenuBar();
       setJMenuBar(jmb);
       
       menu = new JMenu("File");
       menu.setFont(val1);
       
       jmb.add(menu);
       jmb.add(Box.createHorizontalGlue());
       jmb.add(quit);
       
       saving = new JMenuItem("Save");
       saving.addActionListener(new Save());
       
       loading = new JMenuItem("Load");     
       loading.addActionListener(new Load());
       
       menu.add(saving);
       menu.add(loading);      
       
       Cut = new JButton();
       Cut.setText("Cut");
       Cut.addActionListener(new CutText());
       
      
       Copy = new JButton();
       Copy.setText("Copy");
       Copy.addActionListener(new CopyText());
       
       
       Paste = new JButton();
       Paste.setText("Paste");
       Paste.addActionListener(new PasteText());
     
       Container c = getContentPane();
       Container but = new Container();
       but.setLayout(new GridLayout(1, 3));
       
       
       
       text = new JTextArea();
       text.setFont(val);
       text.setLineWrap(true);          // wraps the line if needed, if it goes off the side of the page
       text.setWrapStyleWord(true);     // wraps around the word instead of around the character 
       
       
       
       but.add(Copy);
       but.add(Cut);
       but.add(Paste);
       c.add(BorderLayout.CENTER, text);     
       c.add(BorderLayout.NORTH, but);
        
        
        setVisible(true);
        
    }
  
    
       class Load implements ActionListener {                         // creates the file loader
          
          private JFileChooser open;
          private FileReader fr;
          private BufferedReader br;
          
          public Load(){
              
             open = new JFileChooser();
             open.setCurrentDirectory(new File("c:\\temp"));
             open.setFileFilter(new FileNameExtensionFilter("Open TXT or Dat", "txt", "dat"));
             open.setDialogTitle("Select a file to open");
              
          }
           
          public void actionPerformed(ActionEvent e){
              
              int returnval = open.showOpenDialog(menu);
              
              if (returnval == JFileChooser.APPROVE_OPTION){
                  
                  try {
                      
                     fr = new FileReader(open.getSelectedFile());
                     br = new BufferedReader(fr);
                     text.read(fr, e);
                     br.close();
                    
                   //   fr1 = new FileWriter(open.getSelectedFile());            // reads the file trying to be written
                   //   br1 = new BufferedWriter(fr1);
                   //  text.write(br1);
                      
                  } catch (IOException ex) {
                      System.out.println("File cant be read");
                  }
                      
             
                     
               
                  
              } else {
                  
                 System.out.println("Please select a file");
                  
              }
              
              
              
             
          
      }
        
        
      }
        
    
    
    
       class Save implements ActionListener{  // created the file writer but can only save to an existing file
           
           private JFileChooser open;
           private FileWriter fw;
           private BufferedWriter bw;
           
           
           
           
           public Save(){
               
            open = new JFileChooser();
            open.setCurrentDirectory(new File("c:\\temp"));
            open.setFileFilter(new FileNameExtensionFilter("Save TXT or Dat", "txt", "dat") );
               
               
               
           }
           
           
           
           public void actionPerformed(ActionEvent ae){
               
             int value = open.showSaveDialog(menu);
             
             if (value == JFileChooser.APPROVE_OPTION){
                 
                 try {
                     fw = new FileWriter(open.getSelectedFile());
                     bw = new BufferedWriter(fw);
                     text.write(bw);
                     bw.close();
                     
                 } catch (IOException ex) {
                    System.out.println("Need file to save");
                 }
                 
   
             } else {
                 
                System.out.println("Please select a file");
             }
               
               
               
               
               
           }
           
           
           
           
           
       }
    
    
    
       class CloseWindow implements ActionListener{       // exits the program when pressed
           
           public void actionPerformed(ActionEvent e){
               
           System.exit(0);
               
               
           }
           
                  
           
       }
    
    
       class CutText implements ActionListener {
           
           
           
           public void actionPerformed(ActionEvent ae){
               int i;
               String filling = " ";
               String real = "";
            
               prevText = text.getText();
               
               startpos = text.getSelectionStart();
               endpos = text.getSelectionEnd();
               
               i = endpos - startpos;                      // gives you the amount of spaces that are needed to be saved to paste the value
               
               for (int j = 0; j < i; j++){                // creates a loop that adds tot he string value
                   
                  real = real + filling;
                    
               }
               
               System.out.println(real);
               
               text.setText(prevText.replaceAll(textSel, real));          // replaces the selected string with the amount of characters that were in the loop
              
               
           }
           
           
       }
       
       class PasteText implements ActionListener {
           
           
           public void actionPerformed(ActionEvent ae){
               
               prevText = text.getText();  
               text.setText(prevText);
               text.setSelectionStart(startpos);
               text.setSelectionEnd(endpos);
               text.replaceSelection(textSel);
               
           }
           
           
       }
       
       
       
       class CopyText implements ActionListener {
           
           
           public void actionPerformed(ActionEvent ae){
               
               textSel = text.getSelectedText();
               
           }
           
           
       }
    
    
    
   public static void main(String [] args) throws Exception{
       new TextEdit();
       
       
       
   } 
    
    
}
