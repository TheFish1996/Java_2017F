
/**
 *
 * @author jojob
 */


package session4;
import java.util.regex.*;
import java.util.*;
import java.io.*;

public class TestRegex2 {

 public static void main(String[] args) throws IOException {
    Pattern p = Pattern.compile("define|include|menu");
    BufferedReader br = new BufferedReader(new FileReader("conf/samples.conf"));
    String line;
    
    while ((line = br.readLine()) != null) {
      Matcher m = p.matcher(line);
      if (m.find()) {
        System.out.println(m.group());
      }
      
    }
  }

}
