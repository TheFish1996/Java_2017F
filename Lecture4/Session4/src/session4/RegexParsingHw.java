/**
 *
 * Author: Jonathan Fishkin
 * Cite: Bryan Jimenez-Rojas
 */
package session4;

import java.io.*;
import java.awt.Color; 
import java.util.regex.*;

public class RegexParsingHw {

    public static void main(String[] args) throws IOException{
        FileReader fr = new FileReader("hwregex.dat");
        BufferedReader br = new BufferedReader(fr);
        
        String line;
        
        Pattern def = Pattern.compile("\\s*define\\s+[a-zA-Z]+.*");
        Pattern basestr = Pattern.compile("\\s*base\\s+\"+.*\".*");
        Pattern appstr = Pattern.compile("\\s*appname\\s+\"+.*\".*");
        Pattern fontstr = Pattern.compile("\\s*font\\s+\"+.*\".*");
        Pattern langstr = Pattern.compile("\\s*language\\s+\"+.*\".*");
        Pattern bgCol = Pattern.compile("\\s*bg\\s+C=.*");
        Pattern fgCol = Pattern.compile("\\s*fg\\s+C=.*");
        Pattern nmReg = Pattern.compile("\\s*name\\s+.*");
        Pattern uintReg = Pattern.compile("\\s*uint\\s+/.*");
        Pattern intReg = Pattern.compile("\\s*int\\s+/.*");
        Pattern regexReg = Pattern.compile("\\s*regex\\s+.*");
        Pattern piDouble = Pattern.compile("\\s*pi\\s+[0-9]+[.][0-9]+.*");
        Pattern naDouble = Pattern.compile("\\s*Na\\s+[0-9]+[.][0-9]+.*");
        Pattern gDouble = Pattern.compile("\\s*G\\s+-[0-9]+[.][0-9]+.*");
        Pattern fsize = Pattern.compile("\\s*fontSize\\s+[0-9].*");
        
        String define, base, appname, font, language;
        Color bg, fg;
        Pattern namePat, uintPat, intPat, regexPat;
        double pi, Na, G;
        int fontSize;
        
        while( (line = br.readLine()) != null ){
           line = line.trim();
           line = line.replaceAll("\\s+", " ");
           Matcher m0 = def.matcher(line);
           Matcher m1 = basestr.matcher(line);
           Matcher m2 = appstr.matcher(line);
           Matcher m3 = fontstr.matcher(line);
           Matcher m4 = langstr.matcher(line);
           Matcher m5 = bgCol.matcher(line);
           Matcher m6 = fgCol.matcher(line);
           Matcher m7 = nmReg.matcher(line);
           Matcher m8 = uintReg.matcher(line);
           Matcher m9 = intReg.matcher(line);
           Matcher m10 = regexReg.matcher(line);
           Matcher m11 = piDouble.matcher(line);
           Matcher m12 = naDouble.matcher(line);
           Matcher m13 = gDouble.matcher(line);
           Matcher m14 = fsize.matcher(line);
           String words[] = line.split("\\s");
          
           if(m0.matches()){
               define = words[1];
               System.out.println("define ==> " + define);
           }
           else if(m1.matches()){
               base = words[1];
               System.out.println("base ==> " + base);
           }
           else if(m2.matches()){
               appname = words[1];
               System.out.println("appname ==> " + appname);
           }
           else if(m3.matches()){
               font = words[1];
               System.out.println("font ==> " + font);
           }
           else if(m4.matches()){
               language = words[1];
               System.out.println("language ==> " + language);
           }
           else if(m5.matches()){
               bg = Color.decode("#"+words[1].substring(2));
               System.out.println("bg ==> Color " + words[1].substring(2));
           }
           else if(m6.matches()){
               fg = Color.decode("#"+words[1].substring(2));
               System.out.println("fg ==> Color " + words[1].substring(2));
           }
           else if(m7.matches()){
               namePat = Pattern.compile(words[1]);
               System.out.println("name ==> " + namePat);
           }
           else if(m8.matches()){
               uintPat = Pattern.compile(words[1]);
               System.out.println("uint ==> " + uintPat);
           }
           else if(m9.matches()){
               intPat = Pattern.compile(words[1]);
               System.out.println("int ==> " + intPat);
           }
           else if(m10.matches()){
               regexPat = Pattern.compile(words[1].substring(2,words[1].length()-1));
               System.out.println("regex ==> " + regexPat);
           }
           else if(m11.matches()){
               pi = Double.parseDouble(words[1]);
               System.out.println("pi ==> double " + pi);
           }
           else if(m12.matches()){
               Na = Double.parseDouble(words[1]);
               System.out.println("Na ==> double " + Na);
           }
           else if(m13.matches()){
               G = Double.parseDouble(words[1]);
               System.out.println("G ==> double " + G);
           }
           else if(m14.matches()){
               fontSize = Integer.parseInt(words[1]);
               System.out.println("fontSize ==> int " + fontSize);
           }
        }
    }
    
}
