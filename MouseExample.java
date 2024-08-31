import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseExample implements MouseListener {
    Label label;
    Frame frame;
    MouseExample(){
        label = new Label("Mouse fuctions");
        frame = new Frame("Mouse");

        frame.addMouseListener(this);
        frame.add(label);
        frame.setLayout(new FlowLayout());
        frame.setSize(500,500);
        frame.setVisible(true);
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("Mouse Realsed");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("Mouse Exited");
    }
    public static void main(String[] args) {
        new MouseExample();
    }

}
