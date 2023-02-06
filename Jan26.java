import java.util.Scanner;
import java.util.Random;

public class Jan26 {

    public static void main(String[] args) {
        
        int num1;
        Random generator= new Random();
            //get the users input
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a positive integer: ");
        int num = scanner.nextInt();
        

        num1 = generator.nextInt(num);
        System.out.println("A random integer: "+ num1);

        scanner.close();
}
}