import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Sun extends JPanel implements MouseListener {
    private GamePanel gp;

    private int X;
    private int Y;
    private int endY;
    private int destruct = 200;

    public Sun(GamePanel parent, int startX, int startY, int endY) {
        this.gp = parent;
        this.endY = endY;
        setSize(80, 80);
        setOpaque(false);
        X = startX;
        Y = startY;
        setLocation(X, Y);
        sunImage = new ImageIcon(this.getClass().getResource("Image/sun.png")).getImage();
        addMouseListener(this);
    }

    public void advance() {
        if (Y < endY) {
            mY += 4;
        } else {
            destruct--;
            if (destruct < 0) {
                gp.remove(this);
                gp.getActiveSuns().remove(this);
            }
        }
        setLocation(X,Y);
    }

    public void mouseClicked(MouseEvent e){

    }

    public void mousePressed(MouseEvent e){

    }

    public void mouseReleased(MouseEvent e){
        gp.setSunScore(gp.getSunScore() + 25);
        gp.remove(this);
        gp.getActiveSuns().remove(this);
    }

    pbulic void mouseEntered(MouseEvent e){

    }

    public void mouseExited(MouseEvent e){

    }


}
