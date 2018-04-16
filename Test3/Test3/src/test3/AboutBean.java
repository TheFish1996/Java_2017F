/**
 *
 * @author Jonathan
 */

package test3;


public class AboutBean extends Object {         // by default extends object
   
    private double height;
    private double weight;
    private String name;
    
    public AboutBean(){   }          // beans always have an empty contructor
        
 
    public AboutBean (String name, double height, double weight){
        
        this.name = name;
        this.height = height;
        this.weight = weight;
   
    }
 
    public void setName(String a){
        
         name = a;
        
    }
    
     public String getName(){
        
      return name;
        
    }
    
     
     public void setHeight(double x){
         
         height = x;
  
     }
     
     public double getHeight(){
         
         return height;
         
     }
  
      public void setWeight(double x){
         
         height = x;
         
         
     }
     
     public double getWeight(){
         
         return weight;
         
     }
     
    
}
