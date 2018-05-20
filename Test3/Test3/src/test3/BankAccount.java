/**
 *
 * @author Jonathan
 */

package test3;


public class BankAccount {
    private int money;
    public BankAccount(int x){
        x = money;
          
    }
    
    public double getMoney(){
        
        return money;
        
    }

}

class savingsAccounts extends BankAccount{
    private int money1;
 
    public savingsAccounts(int x){
        super(x);
              
    }
    
    @Override
    public double getMoney(){
      return money1;
        
    }
   
}
