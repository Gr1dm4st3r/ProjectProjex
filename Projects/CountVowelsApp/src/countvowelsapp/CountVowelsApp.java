/*
 * This application takes in a string from the console then checks counts the
 * number of vowels and then prints it back to the console
 */
package countvowelsapp;

import java.util.Scanner;

/**
 * @author Michael O Brien | Gr1dm4st3r
 */
public class CountVowelsApp {
    public static void main(String[] args) {
        System.out.println("Please enter a String you wish the vowels to be counted: ");
        
        Scanner inputScanner = new Scanner(System.in);
        String originalString = inputScanner.nextLine().toLowerCase();
        
        char a = 'a';
        char e = 'e';
        char i = 'i';
        char o = 'o';
        char u = 'u';
        
        int numberOfVowels = 0;
        
        for (int iter = 0; iter < originalString.length(); iter++){
            if(originalString.charAt(iter) == a){
                numberOfVowels++;
            }
            else if(originalString.charAt(iter) == e){
                numberOfVowels++;
            }
            else if(originalString.charAt(iter) == i){
                numberOfVowels++;
            }
            else if(originalString.charAt(iter) == o){
                numberOfVowels++;
            }
            else if(originalString.charAt(iter) == u){
                numberOfVowels++;
            }
        }
        
        System.out.println("Number of vowels are: "+numberOfVowels);
        
    }
}
