/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hello;
import java.util.Scanner;

/**
 * Changes on 23 September
 * @author bacha
 */
public class Hello {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string.");
        String word = input.nextLine();
        char[] letters = new char[word.length()];
        for (int i = 0; i<=word.length()-1; i++){
            letters[i] = word.charAt(i);
        }
        for (int i = word.length()-1; i>=0; i--){
            System.out.print(letters[i]);
        }
        
        System.out.println(word);
        
        
    }
    
}
