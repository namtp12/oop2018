/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 *
 * @author Administrator
 */
public abstract class HoaQua {
    protected int price;
    protected int amount;
    protected String origin;
    protected String color;
    
    /**
     * 
     * @return 
     */    
    public int getPrice() {
        return this.price;
    }
    
    /**
     * 
     * @param price 
     */
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    /**
     * 
     * @return 
     */
    
    public int getAmount() {
        return this.amount;
    }
    
    /**
     * 
     * @param amount 
     */
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    /**
     * 
     * @return 
     */
    
    public String getOrigin() {
        return this.origin;
    }
    
    /**
     * 
     * @param origin 
     */
    
    public void setOrigin(String origin) {
        this.origin = origin;
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
}
