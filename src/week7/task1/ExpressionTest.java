/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task1;

/**
 *
 * @author Administrator
 */
public class ExpressionTest {
    public static void main() {
        // TODO: Group declaration of Numeral or any 
        Expression e1 = new Numeral(10);
        Expression e2 = new Square(e1);
        Expression e3 = new Numeral(1);
        Expression e4 = new Subtraction(e2, e3); // (10^2 - 1)
        Expression e5 = new Numeral(2);
        Expression e6 = new Numeral(3);
        Expression e7 = new Multiplication(e5, e6); // 2*3
        Expression e8 = new Addition(e4, e7); // (10^2 -1 + 2*3)
        Expression e9 = new Square(e8);
        int res = e9.evaluate();
        System.out.println(res);
        System.out.println(e9.toString());
        
        try {
            Expression division = new Division(e1, e3);
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.println("Can not divide by zero");
        }
    }
}
