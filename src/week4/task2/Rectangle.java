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
public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;
    
    /*
    hàm khởi tạo mặc định
    */
    public Rectangle() {
        
    }
    
    /*
    hàm khởi tạo 2 tham số
    */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public Rectangle(double witdth, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    
    /**
     * 
     * @return 
     */
    public double getWidth() {
        return this.width;
    }
    
    /**
     * 
     * @param width 
     */
    public void setWidth(double width) {
        this.width = width;
    }
    
    /**
     * 
     * @return 
     */
    public double getLength() {
        return this.length;
    }
    
    /**
     * 
     * @param length 
     */
    public void setLength(double length) {
        this.length = length;
    }
    
    /**
     * 
     * @return 
     */
    public double getArea() {
        return width * length;
    }
    
    /**
     * 
     * @return 
     */
    public double getPerimeter() {
        return 2 * (width + length);
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
