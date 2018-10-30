/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task2;

/**
 *
 * @author Administrator
 */
public class Task2Test {
    public static void main() {
        //NullPointerException
        try {
            Something sth = null;
            Task2.NullPointer(sth);
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.println("NullPointerException");
        }
        //ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[30];
            Task2.ArrayIndexOutOfBounds(arr);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.println("ArrayIndexOutOfBoundsException");
        }
    }
}

class Something {
    
}
