/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s07_hw2b;

/**
 *
 * @author jojob
 */
public class S07_Hw2b {

    private double n;
    
    
    public S07_Hw2b(double x){
    
    n = x;
    
}

    
    
    public double forward(){
        double sum = 0;
        for(double i = 1; i <= n; i++ ){
            double eq = i * i;
            sum = sum + 1 / eq;
            
        }
       return sum; 
    }
    
    
    
    public static void main(String[] args){
       
        double y = forward(1);
        
        
    }
    
}
