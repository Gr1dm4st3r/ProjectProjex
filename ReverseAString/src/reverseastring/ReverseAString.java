/*
 * This application will take in a string from the command line then reverse
 * the string. After which is printed back out to the console.
 */
package reverseastring;

import java.util.Scanner;
 
/**
 * @author Michael O Brien | Gr1dm4st3r
 */
public class ReverseAString {
    public static void main(String[] args) {
        
        System.out.println("Please enter a String you want to reverse:" );
        Scanner inputScanner = new Scanner(System.in);
        
        String originalString = inputScanner.nextLine();
    
        StringBuilder resultBuilder = new StringBuilder();
        
        String reversedString = new StringBuilder(originalString).reverse().toString();

        System.out.println("The String you have entered is :"+originalString);
        System.out.println("The String Reversed is :"+reversedString);
        
    }
}
