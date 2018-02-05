/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s02_fraction;

/**
 *
 * @author jojob
 */

// class : a kind of object
// object: is an example of (an instance of) a class
// message
// method

public class S02_Fraction {
    private int numerator, denominator;

        public S02_Fraction(int n, int d){
            numerator = n;
            denominator = d;
        }
        public String toString(){
            return numerator+"/"+ denominator;
        }

       public S02_Fraction add(S02_Fraction b){
           S02_Fraction result = new S02_Fraction(this.numerator*b.denominator + this.denominator*b.numerator,
                   this.denominator*b.denominator );
           return result;
       }


    public static void main(String[] args) {
        S02_Fraction a = new S02_Fraction(1,2);
        System.out.println(a);
        S02_Fraction b = new S02_Fraction(1,3);
        S02_Fraction c = a.add(b);
        System.out.println(c);
  
    }

}
