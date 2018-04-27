
/**
 *
 * @author jojob
 */

package lecture13;

public class Lecture13 {


    public static void main (String [] args){
       
        BankAccount newbank = new BankAccount("Jon", "14", 10);
        
        
        
    }

}


class BankAccount {
    
    private String name;
    private String age;
    private double balance;
    
    public BankAccount (String a, String b, double c){
        
        name = a;
        age = b;
        balance = c;
        
    }
    
    
    
}