/*
 * This application takes in a String from the console counts the number of
 * words and then outputs the amount of words back out to the console
 */
package countwordsinstring;

import java.util.Scanner;

/**
 * @author Michael O Brien | Gr1dm4st3r
 */
public class CountWordsInString {
    public static void main(String[] args) {
        System.out.println("Please enter a sentance: ");
        
        Scanner inputScanner = new Scanner(System.in);
        String originalString = inputScanner.nextLine();
        
        originalString = originalString.trim();
        
        
        int wordCount = 1;
        for (int i=0;i<=originalString.length()-1;i++)
        {
            if (originalString.charAt(i) == ' ' && originalString.charAt(i+1)!=' ')
            {
                wordCount++;
            }
        }
        
        System.out.println("The number of words in the string you have entered is: "+wordCount);
        
    }
}
