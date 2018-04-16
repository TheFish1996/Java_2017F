/**
 *
 * @author Jonathan
 */

package test3;

import java.lang.reflect.Method;
import java.util.*;

public class Testbean {

    
    public static void main(String [] args){
        
        Object test = new AboutBean("Jon",160, 180);
  /*    AboutBean a = new AboutBean("Jon",160, 180);   another way of getting the object
        Class b = a.getClass();
        Method a = c.getMethod("getName", String.class);
   */
        Class c = test.getClass();
        
        Method[] m = c.getMethods();
        
        for (int i = 0; i < m.length; i++){
            
            if (m[i].getName().startsWith("set") || m[i].getName().startsWith("get")){
            
            System.out.println(m[i].getName());
           } 
       }
       
        HashSet<String> getters = new HashSet<>();
        HashSet<String> setters = new HashSet<>();
        
        for (int i = 0; i < m.length; i++){
            
            if (m[i].getName().startsWith("get")){
                
                getters.add(m[i].getName().substring(0));
         } 
            
            else if (m[i].getName().startsWith("set")){
                
                setters.add(m[i].getName().substring(0));
            }
         
        }
 
        for (String var : getters){
            
            if (getters.contains(var)){
                
                System.out.println(var);
            }
        }          
    }

}
