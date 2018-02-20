/**
 *
 * @author Jonathan
 */

package session4;
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class RegexParsing {

    private boolean verbose;
    private HashMap<String,String> map;
    private static Pattern blankLine = Pattern.compile("12");
    private static Pattern commands = Pattern.compile("(^\\s+$|^\\s*#|include|menu|regex|toolbar)\\s+([a-zA-Z][a-zA-Z0-9]*)");

    private void loadFile(String filename) throws IOException {
        Scanner s = new Scanner(new BufferedReader(new FileReader(filename)));
        for (int lineNum = 1; s.hasNext(); ++lineNum) {
            String line = s.nextLine();
          if (verbose) {
                System.out.println(lineNum + ": " + line);
       }
                       
           Matcher m = blankLine.matcher(line);
            if (m.find()) {
                String cmd = m.group();
                System.out.println("cmd=" + cmd);
            } else {
                System.err.println("Error " + filename + ":" + lineNum + " No valid command found");
           }
        }
        s.close();
    }
    
    public RegexParsing(String filename) throws IOException {
        verbose = true; // turn it on for now
        map = new HashMap<>();
        loadFile(filename);
    }
    
    
   
    
    public static void main (String [] args) throws Exception{
        
        RegexParsing file = new RegexParsing("hwregex.dat");
   
        
        
    }

}
