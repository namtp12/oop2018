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
     * trả về giá trị của price
     * @return 
     */    
    public int getPrice() {
        return this.price;
    }
    
    /**
     * thiết lập giá hoa quả
     * @param price 
     */
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    /**
     * lấy số lượng 
     * @return 
     */
    
    public int getAmount() {
        return this.amount;
    }
    
    /**
     * thiết lập số lượng
     * @param amount 
     */
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    /**
     * lấy thông tin về nguồn gốc
     * @return 
     */
    
    public String getOrigin() {
        return this.origin;
    }
    
    /**
     * thiết lập thông tin về nguồn gốc
     * @param origin 
     */
    
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    
    /**
     * trả về màu của loại quả tương ứng
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
