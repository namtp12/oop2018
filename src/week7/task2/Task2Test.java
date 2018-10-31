/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7.task2;

import java.io.IOException;
import java.io.FileNotFoundException;

/**
 *
 * @author Administrator
 */
public class Task2Test {
    public static void main() {
        
        // NullPointerException
        // Catch the exception which is thrown from the following method,
        // which is being called
        try {
            Something sth = null;
            Task2.NullPointer(sth);
        }
        catch (NullPointerException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.println("NullPointerException");
        }
        
        // ArrayIndexOutOfBoundsException
        // Catch the exception thrown from the following method, 
        // which is being called
        try {
            int[] arr = new int[30];
            Task2.ArrayIndexOutOfBounds(arr);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.println("ArrayIndexOutOfBoundsException");
        }
        
        // TODO: Make these lines cause an exception
        // ArrayIndexOutOfBounds2()
        // Exception has already been caught in the "inner" method, 
        // inner here means ArrayIndexOutOfBounds2() method
        
        int[] arr = new int[30];
        Task2.ArrayIndexOutOfBounds2(arr);
        
        //Arithmetic 
        Task2.Arithmetic(2, 0);
        
        // TODO: Arithmetic, ClassCast, IO, FileNotFound
        
        // ClassCast
        // Cast an Integer to String,
        // since String is't a subclass of Integer, 
        // then a ClassCastException will be thrown
        // Further reading (Ctrl + F -> enter "cast"):
        // https://o7planning.org/en/10403/java-generics-tutorial
        
        Object newObj = new Integer(5);
        Task2.ClassCast(newObj);
        
        //Testing
        //Task2.ClassCast2(newObj);
        
        //IOException
        try {
            Task2.IO();
        }
        catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.println("IOException");
        }
        //FileNotFoundException
        try {
            Task2.FileNotFound();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
            System.out.println("FileNotFoundException");
        }
        catch (IOException e) {
            e.printStackTrace();
            e.getMessage();
            System.out.println("FileNotFoundException");
        }
    }
}

class Something {
    
}
