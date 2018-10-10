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
public class Triangle {
    Point p1;
    Point p2;
    Point p3;
    int [] xPoints;
    int [] yPoints;
    final int nPoints = 3;
    
    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        p1.setX(x1);
        p1.setY(y1);
        p2.setX(x2);
        p2.setY(y2);
        p3.setX(x3);
        p3.setY(y3);
        xPoints = new int[3];
        yPoints = new int[3];
        xPoints[0] = x1;
        xPoints[1] = x2;
        xPoints[2] = x3;
        yPoints[0] = y1;
        yPoints[1] = y2;
        yPoints[2] = y3;
    }
    
    public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {
        
    }
    
    public void paintTriangle(Graphics g) {
        g.drawPolyline(xPoints, yPoints, nPoints);
    }
    
    
}
