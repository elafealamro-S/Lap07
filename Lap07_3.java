/*
 (Check password) Some websites impose certain conditions for passwords. Assume the following three
conditions for a valid password:
1. 2. 3. A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits Write a method isPasswordValid() that returns true if the string supplied to it as an input parameter is a
valid password or false otherwise.
Write a program that prompts the user to enter a password and then calls the isPasswordValid() method to
check if the password is valid or not. The message “Valid password” or “Invalid password” must be
printed in the main method based on the boolean value returned by the isPasswordValid() method.
 */
package Lap07;

import java.util.Scanner;
public class Lap07_3 {

    public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         System.out.print("Enter a password : ");
         
         String P=input.next();
         
         if(isPasswordValid(P))
             System.out.println("Valid password");
         else
             System.out.println("Invalid password");}

    public static boolean isPasswordValid(String P) {
        boolean valid=true;
        
    int digitCtr=0;
    
    for(int x=0;x<P.length();x++){
        char c=P.charAt(x);
        
        if(!isLetter(c)&&!isDigit(c)){
            valid=false;}
        
        if(isDigit(c)) digitCtr++ ;}
    
    if(digitCtr>=2&&P.length()>=8&& valid)
        return true;
    else
        return false;}

    private static boolean isDigit(char c) {
       if(c>='0'&&c<='9')
                return true;
            else
                return false;}

    private static boolean isLetter(char c) {
        if((c>='a'&&c<='z')||(c>='A'&& c<='Z'))
                return true;
            else
                return false;}
    }

   
    
    