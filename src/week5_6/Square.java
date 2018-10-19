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
public class Square extends Rectangle {
    
    protected int size;
    
    public Square() {
        
    }
    
    public Square(int size) {
        super(size, size);
        this.size = size;
    }
    
    public Square(int size, String color, boolean filled) {
        super(size, size, color, filled);
        this.size = size;
    }
    
    @Override
    public void moveTo() {
        x += 3;
        y += 2;
    }
    
    @Override
    public void draw(Graphics g) {
        g.drawRect(x, y, size, size);
    }
    
    /**
     * 
     * @return 
     */
    public int getSide() {
        return super.getHeight();
    }
    
    /**
     * 
     * @param size 
     */
    public void setSide(int size) {
        super.setWidth(size);
        super.setHeight(size);
    }
    /**
     * 
     * @param size 
     */
    @Override
    public void setWidth(int size) {
        super.setWidth(size);
    }
    
    /**
     * 
     * @param size 
     */
    @Override
    public void setHeight(int size) {
        super.setHeight(size);
    }
    
    /**
     * 
     * @return 
     */
    public String toString() {
        return null;
    }
}
