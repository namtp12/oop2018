import week2.task1.*;
import week2.task2.*;
import week2.task3.*;


public class Main {
    public static void main(String[] args) {
        Fraction f = new Fraction(2, 3);
        Fraction f2 = new Fraction(4, 6);
        boolean b = f.equals(f2);
        System.out.println(b);
        Fraction f3 = f.add(f2);
        //f3.reduce();
        f3.printFraction();
    }
}
