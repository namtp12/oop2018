/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.awt.Graphics;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class Layer extends JPanel {
    
    ArrayList<Shape> shapeList;
    
    
    
    public void addShape() {
        
    }
    
    
    public Layer() {
        new JPanel();
        shapeList = new ArrayList<>();
        
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
    }
}
