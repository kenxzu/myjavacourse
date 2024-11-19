
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.drawingpanel;

/**
 *
 * @author knmor
 */
import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Ensures the panel is properly rendered
        int width = getWidth();
        int height = getHeight();
        
        int increment = 15;
        
        int widthStep = width/increment;
        int heightStep = height/increment;
        // Drawing lines across the panel
       int count = 0;
        while (count  < increment){
            
            //top left
            g.drawLine(0, 0,
                    widthStep * count , height - count * heightStep);
           //buttom right
            g.drawLine(width, height,
                     widthStep * count , height - count * heightStep);
           //left bottom
            g.drawLine(0, height,
                   widthStep * count , count * heightStep);
          // top rigtht
            g.drawLine(width, 0,
                          widthStep * count , count * heightStep);
            count++;
        }
     
}
}
