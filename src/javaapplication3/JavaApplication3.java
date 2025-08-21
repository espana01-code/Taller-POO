
package javaapplication3;
public class JavaApplication3 {
    public static void main(String[] args) { 
        double C = 21;
        double F = (C * 9/5) + 32;
        System.out.println(C + " tus grados Celsius son " + F + " grados Fahrenheit.");
        
        F = 56;
        C = (F - 32) * 5/9;
        System.out.println(F + " tus grados Fahrenheit son " + C + " grados Celsius.");
    }
}