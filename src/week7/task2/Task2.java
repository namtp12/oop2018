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
}
