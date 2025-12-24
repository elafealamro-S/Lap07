/*
 (Count letters in string) Write a method countLetters() that accepts a string as an input parameter and returns
the number of letters present in the input string. In the main() method, ask the user to enter a string, then pass the
string entered by the user to the countLetters() method as an input parameter, then display the value returned by
countLetters() in the main method.
 */
package Lap07;

import java.util.Scanner;
public class Lap07_1 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Enter a String : ");
        String ss=input.next();
        System.out.println("Count of letter in string: "+countLetters(ss));}

    private static int countLetters(String ss) {
       int count=0;
       for(int x=0;x<ss.length();x++){
           if(ss.charAt(x)>='a'&& ss.charAt(x)<='z')count++;
            if(ss.charAt(x)>='A'&& ss.charAt(x)<='Z')count++;}
       
       return count;
    }
    
}