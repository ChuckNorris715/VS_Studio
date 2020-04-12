package ch4;

import java.awt.Graphics;
import javax.swing.JPanel;
import javax.swing.JFrame;

class graphicalSpiral extends JPanel{
    /**
     *
     */
    private static final long serialVersionUID = 6186752524174900643L;
    public void paintComponent(Graphics myG)
    {
        int myWidth = getSize().width;
        int myHeight = getSize().height;
        int wCenter = myWidth / 2;
        int hCenter = myHeight / 2;
        for (int a = 0; a < 6; a++)
        {
            myG.drawLine(wCenter + (20 * a), hCenter - (20 * a), wCenter + (20 * a), hCenter + 20 + (20 * a));
            myG.drawLine(wCenter + (20 * a), hCenter + 20 + (20 * a), wCenter - 20 - (20 * a), hCenter + 20 + (20 * a));
            myG.drawLine(wCenter - 20 - (20 * a), hCenter + 20 + (20 * a), wCenter - 20 - (20 * a),
                    hCenter - 20 - (20 * a));
            myG.drawLine(wCenter - 20 - (20 * a), hCenter - 20 - (20 * a), wCenter + 20 + (20 * a),
                    hCenter - 20 - (20 * a));
        }
    }

    public static void main(String[] args)
    {
        graphicalSpiral myPanel = new graphicalSpiral();
        JFrame mySpiralApp = new JFrame();
        mySpiralApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mySpiralApp.add(myPanel);
        mySpiralApp.setSize(300, 300);
        mySpiralApp.setVisible(true);
    }
}