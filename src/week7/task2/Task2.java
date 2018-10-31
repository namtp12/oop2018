package week7.task2;

import java.lang.NullPointerException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ArithmeticException;
import java.lang.ClassCastException;
import java.io.IOException;
import java.io.FileNotFoundException;



public class Task2 {
    public static void NullPointer(Object obj) throws NullPointerException {
        /*
        if (obj == null) {
            throw new NullPointerException();
        }
        */
        obj.getClass();
    }
    
    public static void ArrayIndexOutOfBounds(int[] arr) throws ArrayIndexOutOfBoundsException {
        System.out.println(arr[arr.length]);
    }
    
    public static void ArrayIndexOutOfBounds2(int arr[]) {
        try {
            for(int i = 0; i < arr.length; i+=2) {
                arr[i] = i;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.println("ArrayIndexOutOfBounds");
        }
    }
    
    public static void Arithmetic() {
        
    }
    
    public static void ClassCast(Object obj) {
        // Cast obj to String
        // If String is not a subclass of class of object obj, 
        // a ClassCastException will be thrown
        try {
            obj = (String) obj;
        }
        catch(ClassCastException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.println("ClassCastException");
        }
    }
    
    public static void ClassCast2(Object obj) {
        // Cast obj to String
        if (!(obj instanceof String)) {
            System.out.print("Nam");
            throw new ClassCastException(); // this line ends the program
            //System.out.print("Nam");
        }
    }
    
    public static void IO() {
        
    }
    
    public static void FileNotFound() {
        
    }
}
