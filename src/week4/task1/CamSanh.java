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
public class CamSanh extends Cam {
    private boolean voday = true;
    
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
