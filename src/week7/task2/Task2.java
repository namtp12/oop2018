package week7.task2;

import java.lang.NullPointerException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.ArithmeticException;
import java.lang.ClassCastException;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

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
            // Assume we are initialize a part of an array from the last element
            // to the i-th element, whereas i is calculated before to
            // implemenent a developing algorithm
            // Since we usually do not check the value of i, some case it'll 
            // cause the ArrayOutOfBounds
            int i = 10 + 3 - 45;
            for(int j = arr.length - 1; j >= i; j--) {
                arr[j] = 0;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.println("ArrayIndexOutOfBounds");
        }
    }
    
    public static void Arithmetic(double divident, double divisor) {
        try {
            double quotient = divident / divisor;
        }
        catch (ArithmeticException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.println("ArithmeticException");
        }
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
    
    public static void ClassCast2(Object obj) throws ClassCastException {
        // Cast obj to String
        if (!(obj instanceof String)) {
            //throw new ClassCastException();
            // this above line ends the program, so we 'll comment it
        }
    }
    
    public static void IO() throws IOException {
        File file = new File("\1.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buf = new BufferedReader(reader);
        try {
            String line;
            while ((line = buf.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.print("IOException");
        }
    }
    
    
    // I do not understand this!!
    public static void FileNotFound() throws IOException {
        File file = new File("\2.txt");
        FileReader reader = new FileReader(file);
        BufferedReader buf = new BufferedReader(reader);
        try {
            String line;
            while ((line = buf.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
            System.err.println("FileNotFoundException");
        }
    }
}
