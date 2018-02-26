
/**
 *
 * Author : Jonathan Fishkin
 * Cite: Bryan Jimenez-Rojas
 */

package session4;

import java.io.*;
import java.util.*;

public class SolarSystem {
    private final String orbits;
    private final double mass;
    private final double diam;
    private final double dist;
    public SolarSystem(String orb, double ms, double dm, double dt){
        orbits = orb;
        mass =  ms;
        diam = dm;
        dist = dt;
    }

    public String toString(){
        String s = "Orbits: " + orbits + '\n' + 
                   "Mass (kg): " + mass + '\n' + 
                   "Diameter (m): " + diam + '\n' +
                   "Mean orbit distance (m): " + dist + '\n';
        return s;
    }
    public static void main(String[] args) throws IOException {
        HashMap<String, SolarSystem> a = new HashMap<>(4);
        FileReader fr = new FileReader("solarsystem.dat");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line=br.readLine()) != null){
            String[] words = line.split("\\s+");
            if(words[0].equals("Sun") || words[0].equals("Venus") || words[0].equals("Earth") || words[0].equals("Moon")){
                double ms = Double.parseDouble(words[2]);
                double dm = Double.parseDouble(words[3]);
                double dt = (Double.parseDouble(words[5]) - Double.parseDouble(words[4]))/2;
                a.put(words[0], new SolarSystem(words[1], ms, dm, dt));
            }
        }
        br.close();
        for(String body : a.keySet()){
            System.out.println(body + ":" + '\n' + a.get(body));
        }
    }
}