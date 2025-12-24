/*
 (Conversions between Celsius and Fahrenheit) Create the following two methods:
celsiusToFahrenheit() (to convert from Celsius to Fahrenheit)
fahrenheitToCelsius() (to convert from Fahrenheit to Celsius)
 */
package Lap07;

import java.util.Scanner;
public class Lap07_2 {

    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit\t|\tFahrenheit\tCelsius");
        for(double c = 40, f = 120; c > 30; c -= 1, f -= 10){
            System.out.printf("%.1f \t\t %.1f \t\t|\t", c, celsiusToFahrenheit(c));
            System.out.printf("%.1f \t\t %.1f\n", f, fahrenheitToCelsius(f));}
    }

    public static double celsiusToFahrenheit(double celsius){
        return (9.0/5)*celsius + 32;}

    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0/9)*(fahrenheit - 32);}
}