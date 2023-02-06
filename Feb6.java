import javax.print.attribute.standard.PrinterResolution;
import java.lang.String;
import java.util.Scanner;


// Uses employee.java

public class Feb6 {
    public static void main(String[] args) {
        // string object
        String s = new String ("COMP 127");
        int sLenght = s.length();
        System.out.println(sLenght);

        // "new" creates an object of whatever comes after it.  In this example its a scanner, above its a String.


        // scanner object
        Scanner p = new Scanner(System.in);  //System.out
        
        System.out.print("Enter a name: "); //System.in
        String name = p.nextLine();

        System.out.println(name);


        // Working from employee.java
        // OPTION 1
        employee e1 = new employee();

        e1.name = "Nick";
        e1.position = "CEO";
        e1.yob = 2004;

        employee e2 = new employee();

        e2.name = "Julian";
        e2.position = "President";
        e2.yob = 2003;


        // OPTION 2
        //employee e1 = new employee("Nick", "CEO", 2004);
        //employee e2 = new employee("Julian", "President", 2003);

        
        
    }
}
