package lecture13;

/**
 *
 * @author dkruger
 */
public class Person implements Cloneable {
    private String firstName, lastName;
 

    public Person(String firstName, String lastName) {
          this.firstName = firstName;
          this.lastName = lastName;
    
    }

    public boolean equals(Object obj) {            // quiz need to know
        Person p = (Person)obj;
        if (firstName.equals(p.firstName) && lastName.equals(p.lastName)){
            return true;
        }else 
            return false;
        
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        
       Person a = new Person("Dov", "Kruger");
       Person b = new Person("Dov", "Kruger");
       System.out.println(a == b);
       System.out.println(a.equals(b));
       Person c = b; // does not copy
       Person d = (Person)b.clone(); // You have to specify the object you are referencing because b.clone cant tell what object is referencing
       System.out.println(d==b); // should be FALSE
    }
}
