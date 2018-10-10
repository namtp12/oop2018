/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.awt.Graphics;

/**
 *
 * @author Administrator
 */
public class Circle extends Shape {
    private double x, y;
    private double radius = 0.0;
    private final double PI = 3.14;
    //IDE hint: initializer can be moved to constructor
    
    public Circle() {
        
    }
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }
    
    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
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
    
    public void paintCircle(Graphics g) {
        g.drawRect((int)x, (int)y, 1, 1); 
        g.drawOval((int)x - 40, (int)y - 40, 80, 80);
    }
    
    public void fillOval(int x, int y, int width, int height) {
        
    }
    
    public void setCenterPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public void move() {
        x++;
        y++;
    }
}
