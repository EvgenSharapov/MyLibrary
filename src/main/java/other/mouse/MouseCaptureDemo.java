package other.mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseCaptureDemo extends JFrame implements MouseMotionListener {
        public JLabel mouseHoverStatus;

    public static void main(String[] args) {
        new MouseCaptureDemo();

    }

    MouseCaptureDemo(){
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setTitle("Coordinates of mouse motion");
        mouseHoverStatus=new JLabel("No mouse hover detected",JLabel.CENTER);
        frame.add(mouseHoverStatus);
        frame.addMouseMotionListener(this);
        frame.setVisible(true);

    }
    @Override
    public void mouseDragged(MouseEvent e) {
    }
    @Override
    public void mouseMoved(MouseEvent e) {
        mouseHoverStatus.setText("X: "+e.getX()+"  \nY: "+e.getY());
    }
}
