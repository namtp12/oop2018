/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task2;

/**
 *
 * @author Administrator
 */
public class Circle extends Shape {
    private double radius = 0.0;
    private double PI = 3.14;
    
    public Circle() {
        
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    /**
     * 
     * @return 
     */
    public double getRadius() {
        return this.radius;
    }
    
    /**
     * 
     * @param radius 
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    /**
     * 
     * @return 
     */
    public double getArea() {
        return PI * radius * radius;
    }
    
    /**
     * 
     * @return 
     */
    public double getPerimeter() {
        return 2 * PI * radius;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return null;
    }
}
