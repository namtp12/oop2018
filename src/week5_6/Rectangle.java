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
public class Rectangle extends Shape {
    protected int width = 1;
    protected int height = 1;
    
    public Rectangle() {
        
    }
    
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }
    
    public Rectangle(int witdth, int height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }
    
    @Override
    public void moveTo() {
        x += vx;
        y += vy;
    }
    
    @Override
    public void bounce() {
        if (x  <= 0 || Math.abs(x + width) >= horBound ) {
            vx = -vx;
        }
        if (y <= 0 || Math.abs(y + height) >= verBound) {
            vy = -vy;
        }
    }
    
    @Override
    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }
    
    /**
     * 
     * @return 
     */
    public int getWidth() {
        return this.width;
    }
    
    /**
     * 
     * @param width 
     */
    public void setWidth(int width) {
        this.width = width;
    }
    
    /**
     * 
     * @return 
     */
    public int getHeight() {
        return this.height;
    }
    
    /**
     * 
     * @param height 
     */
    public void setHeight(int height) {
        this.height = height;
    }
    
    /**
     * 
     * @return 
     */
    public int getArea() {
        return width * height;
    }
    
    /**
     * 
     * @return 
     */
    public int getPerimeter() {
        return 2 * (width + height);
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
