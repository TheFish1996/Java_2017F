
/**
 *
 * @author jojob
 */

package session4;
import java.util.*;
import java.io.*;

public class Session4 {
    
    
    public static void buildingArrays() {
        int[] a = { 5, 4, 3 };
        for (int i = 0; i < a.length; ++i)
            System.out.print(a[i]);
        
        final int n = 10;
        int[] b = new int[n];
        for (int i = 0; i < n; ++i)
            b[i] = i + 3;
        for (int x : b)
            System.out.print(x + " ");
        System.out.println();
        
        
    }
    
    public static void buildingArrayLists() {
        ArrayList<Integer> a = new ArrayList <> ();
        a.add(new Integer(5)); //unnecessary boxing
        a.add(16); // automatically creates new Integer(16)
        a.remove(0);
        a.add(0, 93);
        
        int sum = 0;
        for (int x : a) {
            
            sum += x;
        }
        
        ArrayList <String> b = new ArrayList<> (1000000);
                for (String s : b) {
                    System.out.println(s);
                }
                
                for (int i = 0; i < 1000000; i++){
                    b.add(i);
                    
                }
                    
                
        // build an array list
        // grow it each time around
        // remove some elements
        // print out
    }
    
    public static void buildingHashMaps() {
        HashMap<String,Integer> h = new HashMap<>();
        h.put("AAPL", 1); // new Integer (1)
        h.put("IBM",  2);
        h.put("MSFT", 3);
        h.put("3", 99);
     //   Integer v = h.get("IBM");
        Integer v = h.get("xxx");
        if (v == null){
        System.out.println("Object not there!");
    }
        System.out.println(h.get("AAPL"));
        int v2 = h.get("MSFT");
        System.out.println(v2+1);
        
        // iterate through an entire hash map
    }

    
    public static void displayHashMap() throws FileNotFoundException {
        FileReader fr =   new FileReader("data/dict.dat");
        BufferedReader br = new BufferedReader(fr);
        String line;
        
        
        HashMap<String,String> englishToChinese = new HashMap<>();
        HashMap<String,String> chineseToEnglish = new HashMap<>();
        while ((line = br.readLine()) != null) {
         String [] words =  line.split("\\s+");
         if (words.length >= 2){
             System.out.println(words[0] + "-->" + words[1]);
             englishToChinese.put(words[0], words[1]);
            
             
         } else {
             englishToChinese.put(words[0], null);
             
             
         }
        
            
            
        }  
        }
        br.close();
        
    }
    
    public static void loadingProperties() {

    }
        
    }
    
    public static void main(String[] args) {
        buildingArrays();
        buildingArrayLists();
        buildingHashMaps();
        displayHashMap();
        loadingProperties();
    
}