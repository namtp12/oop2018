/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

/**
 *
 * @author Administrator
 */
public class Shape {
    private String color = "red";
    private boolean filled = true;
    
    public Shape() {
        
    }
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    /**
     * 
     * @return 
     */    
    public String getColor() {
        return this.color;
    }
    
    /**
     * 
     * @param color 
     */    
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * 
     * @return 
     */    
    public boolean isFilled() {
        return this.filled;
    }
    
    /**
     * 
     * @param filled 
     */    
    public void setFilled(boolean filled) {
        this.filled = filled;
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
