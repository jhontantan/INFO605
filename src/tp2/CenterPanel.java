package src.tp2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class CenterPanel extends JPanel {
	
	private Table table;
	Image robot;
	
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        robot = new ImageIcon("robot.jpg").getImage();
        int[] xPoints = {100,200,300,400,500,600};
        int[] yPoints = {100,200,300,400,500,600};
        int nPoint = xPoints.length;
        
        

        Graphics2D g2 = (Graphics2D) g;
        
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.drawImage(robot, 50,100,null);
        
        
        g2.setColor(Color.RED);

        g2.fillRect( 250,250,100,100);

        for (int i = 0; i < table.getSommets().size(); i++) {
        	
          //  g2.fillOval(x, y, 100, 100);
        }

    }


}


