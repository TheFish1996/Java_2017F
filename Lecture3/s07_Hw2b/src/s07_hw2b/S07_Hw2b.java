/**
 *
 * Author : Jonathan Fishkin
 * Cite: Suhail Mansuri
 * Doing it backwards is more accurate
 * 
 */

package s07_hw2b;

import java.lang.*;


public class S07_Hw2b {
    
    public static double forward(double n){
        double sum = 0;
        for(double i = 1; i <= n; i++ ){
            double eq = i * i;
            sum = sum + 1 / eq;
            
            
        }
       return Math.sqrt(6*sum); 
    }
    
    public static double backward(double n){
        double sum = 0;
        for (double i = n; i > 0; i--){
            double eq = i * i;
            sum = sum + 1 / eq;
        }
       return Math.sqrt(6*sum);
    }
    
    
    
    public static void main(String[] args){
       
   
        System.out.println(forward(1));
        System.out.println(forward(10));
        System.out.println(forward(100));
        System.out.println(forward(1000));
        System.out.println(forward(10000));
        System.out.println(forward(100000));
        
        System.out.println("Below is backwards calculation");
        
        System.out.println(backward(1));
        System.out.println(backward(10));
        System.out.println(backward(100));
        System.out.println(backward(1000));
        System.out.println(backward(10000));
        System.out.println(backward(100000));
        
        
    }
    
}
