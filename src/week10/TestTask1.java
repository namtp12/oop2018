/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week10;

import java.util.List;

/**
 *
 * @author Administrator
 */
public class TestTask1 {
    //String path = "\\src\\week9\\Utils.java";
    static String path = null;
    
    public static void main() {
        path = "src\\week9\\Utils.java";
        List<String> allFunc = Task1.getAllFunctions(path);
        for(String s : allFunc) {
            System.out.println(s);
        }
    }
}
