/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 * lớp táo thừa kế cả 4 thuộc tính của lớp hoa quả: giá, số lượng, nguồn gốc, màu
 * @author Administrator
 */
public class Tao extends HoaQua {
    private String color;
    
    public Tao() {
        this.color = "Red";
    }
    
    @Override
    public String getColor() {
        return this.color;
    }
    
    /**
     * 
     * @param color 
     */
    
    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
