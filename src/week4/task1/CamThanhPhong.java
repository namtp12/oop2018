/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4.task1;

/**
 * lớp cam thanh phong thừa kế 4 thuộc tính từ lớp Hoa Quả, 2 thuộc tính riêng
 * @author Administrator
 */
public class CamThanhPhong extends Cam {
    private String color = "Yellow";
    private boolean itHat = true;
    
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
