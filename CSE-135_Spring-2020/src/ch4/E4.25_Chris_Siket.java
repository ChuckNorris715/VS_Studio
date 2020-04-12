package ch4;

import java.applet.*;
import java.awt.*;

public class faceComponent extends Applet {
    public void paint(Graphics g)
    {

        g.drawOval(80, 70, 150, 150);

        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);

        g.drawLine(130, 180, 180, 180);
    }
} 
