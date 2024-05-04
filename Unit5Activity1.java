import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Unit5Activity1 extends JPanel{

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Color color1 = new Color(100, 199, 100);
        Color color2 = new Color(208, 180, 45);

    for(int i = 5; i > 0; i--)
    {
        int x = 250 + i*25;
        int y = x;
        int width = 250 - 50*i;
        int height = width;
        System.out.println(x + " : " + width);

        if(i == 1 || i == 3 || i == 5) 
        {
            g.setColor(color1);
        }

        else if(i == 2 || i == 4)
        {
            g.setColor(color2);
        }

        g.fillOval(x, y, width, height);
    }
}   





    public static void main(String[] args){
        Unit5Activity1 panel = new Unit5Activity1();
        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(500, 500);
        application.setVisible(true);
    }//main

}//class