/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2.task2;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main() {
        
        Fraction f = new Fraction(2, 3);
        Fraction f2 = new Fraction(4, 6);
        boolean b = f.equals(f2);
        System.out.println(b);
        Fraction f3 = f.add(f2);
        f3.reduce();
        f3.printFraction();
    }
    
}
