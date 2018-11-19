/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class TestTasks {
    public static void main() {
        List<Double> list = new ArrayList<>();
        for(int i = 0; i < 1000; i++) {
            double d = week10.Task2.getRandomValue();
            list.add(d);
        }
        
        Double d = Task2.findMax(list);
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 100; j++) {
                System.out.print(list.get(i * 100 + j)+ " ");
            }
            System.out.println();
        }
        System.out.println(d);
    }
}
