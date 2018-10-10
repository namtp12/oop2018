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
public class Square extends Rectangle {
    
    public Square() {
        
    }
    
    public Square(double size) {
        super(size, size);
    }
    
    public Square(double size, String color, boolean filled) {
        super(size, size, color, filled);
    }
    
    /**
     * 
     * @return 
     */
    public double getSide() {
        return super.getLength();
    }
    
    /**
     * 
     * @param size 
     */
    public void setSide(double size) {
        super.setWidth(size);
        super.setLength(size);
    }
    /**
     * 
     * @param size 
     */
    @Override
    public void setWidth(double size) {
        super.setWidth(size);
    }
    
    /**
     * 
     * @param size 
     */
    @Override
    public void setLength(double size) {
        super.setLength(size);
    }
    
    /**
     * 
     * @return 
     */
    public String toString() {
        return null;
    }
}
