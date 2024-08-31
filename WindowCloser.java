import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowCloser extends Frame {
    WindowCloser(){
        Button bt = new Button();
        add(bt);
        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new WindowCloser();
    }
}
