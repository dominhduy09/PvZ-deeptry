import java.awt.event.ActionEvent;
import java.util.Timer;

public class SunFlower extends Plants {
    private Timer sunProduceTimer;

    public SunFlower(GamePanel parent, int x, int y){
        super(parent, x, y);
        sunProduceTimer = ActionEvent e;
        new Timer(15000, (ActionEvent e){
            Sun sta = new Sun(getGp(),60 + x * 100,110 + y * 120,130 + y * 120);
            getGp().getActiveSuns().add(sta);
            getGp().add(sta, new Interger(1)) ;
        });
    }

}