
/**
 *
 * @author jojob
 */

package session4;
import java.util.regex.*;

public class TestRegex {
public static void main(String[] args) {
 //   Pattern test1 = Pattern.compile("class\\s+[A-Z][a-zA-Z0-9]*\\s*{");
    Pattern p = Pattern.compile("[a-zA-Z_][a-zA-Z0-9_]*");
    String s = "abc a123 ABC 123 hello thisIsALongVarName testing123 123ABC";
    Matcher m = p.matcher(s);
    while (m.find()) {
      System.out.println(m.group());
    }
  }


}
