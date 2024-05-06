import javax.swing.ImageIcon;
import javax.swing.JPanel;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Sun extends JPanel implements MouseListener {
    private GamePanel gamePanel;
    private int x;
    private int y;
    private int endY;
    private int destructionCountdown = 200;
    private Image sunImage;

    public Sun(GamePanel parent, int startX, int startY, int endY) {
        gamePanel = parent;
        this.endY = endY;
        setSize(80, 80);
        setOpaque(false);
        x = startX;
        y = startY;
        setLocation(x, y);
        new ImageIcon(this.getClass().getResource("Image/sun.png")).getImage();
        addMouseListener(this);
    }

    public void advance() {
        if (y < endY) {
            y += 4;
        } else {
            destructionCountdown--;
            if (destructionCountdown < 0) {
                gamePanel.remove(this);
                gamePanel.getActiveSuns().remove(this);
            }
        }
        setLocation(x, y);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
    }

    @Override
    public void mouseEntered(MouseEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
    }

    @Override
    public void mouseExited(MouseEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
    }

    @Override
    public void mousePressed(MouseEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
    }

    @Override
    public void mouseReleased(MouseEvent e) {

        throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
    }

}