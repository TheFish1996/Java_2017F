/**
 *
 * @author Jonathan
 */

package test1;


public class Test1 {

    private String x;
    private double y;
    
    public Test1(String name, double age ){
        x = name;
        y = age;
          
    }
    
    public String getName(){
        String name = x;
        return name;
        
        
    }
    
    public void print(){ // public and whatever you are returning and then the name of the function
        System.out.println("Name : " +  x + " Age : " + y);
            
    }
    
    public void Birthday(){
        y = y  + 1;
        print();
             
    }
    
    public boolean AmIOld(){
       boolean x;    // boolean does true or false
       if (y > 50){
           x = true; 
           
           
       } else {
           
          x = false; 
           
       }
        
      return x; 
    }
   
    
    
    public static void main (String [] args){
        
     Test1 p1 = new Test1("Dov",50);
     Test1 p2 = new Test1("Yu-Dong",45);

    System.out.println(p1.getName());
    p2.print(); //Print Name and Age
     
    p1.Birthday(); //Add one to the age and print out the name and age
    p1.print(); // prints the new variable
    
    System.out.println(p2.AmIOld()); //prints out true if age is greater than 50. Prints false otherwise
    System.out.println(p1.AmIOld());
        
    }
    

}
