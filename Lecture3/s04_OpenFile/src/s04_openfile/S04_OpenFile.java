/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s04_openfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class S04_OpenFile {
    
  
    public static void main (String[] args) throws Exception{
     FileReader fr = new FileReader ("test.dat");  // new --> other --> empty file
 //   Scanner s = new Scanner(fr); // flexibility
    Scanner s = new Scanner(new BufferedReader(fr)); //Buffered reader parses the file faster, faster to use
    String text = s.next();
    double d = s.nextDouble();
    int n = s.nextInt();
    System.out.println(text);
    System.out.println(d);
    System.out.println(n);
  
    }
    
}
