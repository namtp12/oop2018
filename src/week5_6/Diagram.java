/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week5_6;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class Diagram extends JFrame implements Runnable {
    
    Circle c;
    Thread t;
    Rectangle r;
    ArrayList<Shape> shapeList;
    
    public Diagram() {
        shapeList = new ArrayList<>();
        setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ArrayList<Layer> layerList = new ArrayList<>();         
        Layer l1 = new Layer();
        layerList.add(l1);            
        
        l1 = new Layer();
        
        c = new Circle(50, 50, 30);
        c.setVelo(4, 5);
        
        r = new Rectangle(50, 50, 30, 45);
        r.setVelo(5, 6);
        
        shapeList.add(c);
        shapeList.add(r);
        //l1.add(c);
        //l1.add(r);
        
        t = new Thread(this);
        t.start();
        setVisible(true);
    }
    
    public void deleteTriangle() {
        
        for (Shape s : shapeList) {
            if (s instanceof Triangle) {
                
        }
        }
        
    }
    
    public static void main() {
        new Diagram();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for(Shape s : shapeList) {
            s.draw(g);
        }
    }
    
    public void move() {
        c.moveTo();
        r.moveTo();
        c.bounce();
        r.bounce();
        repaint();
    }
    
    @Override
    public void run() {
        while(true) {
            move();
            try {
                Thread.sleep(20);
            }
            catch (InterruptedException e) {
                
            }
        }
    }
}
