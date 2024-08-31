import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class BallGame extends Frame implements MouseMotionListener {
    int circleX=300,circleY=300,circleRadius=20;
    BallGame(){
        addMouseMotionListener(this);
        setSize(800,800);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BallGame();
    }
    public void paint(Graphics g){
        super.paint(g);
        g.setColor(Color.black);
        g.fillOval(circleX,circleY,100,100);
    }
    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        if(x < circleX+circleRadius){
            circleX++;
        }
        if(x > circleX + circleRadius){
            circleX--;
        }
        if(y < circleY+circleRadius){
            circleY++;
        }
        if(y > circleY + circleRadius){
            circleY--;
        }
        repaint();
    }
}
