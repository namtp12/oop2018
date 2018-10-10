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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Administrator
 */
public class Diagram extends JFrame implements Runnable {
    
    Circle c;
    Thread t;
    
    
    public Diagram() {
        setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        c = new Circle(0, 0);
        
        t = new Thread(this);
        t.start();
        setVisible(true);
    }
    
    public static void main() {
        new Diagram();
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        c.paintCircle(g);
    }
    
    public void move() {
        c.move();
        repaint();
    }
    
    @Override
    public void run() {
        while(true) {
            move();
            try {
                Thread.sleep(15);
            }
            catch (InterruptedException e) {
                
            }
        }
    }
}
