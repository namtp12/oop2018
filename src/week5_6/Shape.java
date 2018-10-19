/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.awt.Component;
import java.awt.Graphics;

/**
 *
 * @author Administrator
 */
public abstract class Shape extends Component {
    
    protected int verBound = 600, horBound = 600;
    
    protected int x, y;
    
    protected int vx, vy;
            
    private String color = "red";
    private boolean filled = true;
    
    public Shape() {
        
    }
    
    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    
    public void setVelo(int vx, int vy) {
        this.vx = vx;
        this.vy = vy;
    }
    
    /**
     *
     * @param g
     */
    public abstract void draw(Graphics g);
    
    public abstract void moveTo();
    
    public abstract void bounce();
    
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
