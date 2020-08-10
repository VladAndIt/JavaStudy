package Part_2.Chapter_22_Events;

import java.awt.*;
import java.awt.event.*;

public class MouseEventsDemo extends Frame implements MouseListener, MouseMotionListener {

    String msg = "";
    int mouseX = 0, mouseY = 0;

    public static void main(String[] args) {
        MouseEventsDemo appwin = new MouseEventsDemo();
        appwin.setSize(new Dimension(600, 600));
        appwin.setTitle("Mouse Move");
        appwin.setVisible(true);

    }

    public MouseEventsDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addWindowListener(new MyWindowAdapter());
    }
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        msg = msg + " -- click received";
        repaint();
    }
    @Override
    public void mouseEntered(MouseEvent me) {
        mouseX = 300;
        mouseY = 300;
        msg = " Mouse entered";
        repaint();
    }
    @Override
    public void mouseExited(MouseEvent me) {
        mouseX = 300;
        mouseY = 300;
        msg = "Mouse exited.";
        repaint();
    }
    @Override
    public void mousePressed(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button down";
        repaint();
    }
    @Override
    public void mouseReleased(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "Button Released";
        repaint();
    }
    @Override
    public void mouseDragged(MouseEvent me) {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = " * " + "mouse at " + mouseX + ", " + mouseY;
        repaint();
    }
    @Override
    public void mouseMoved(MouseEvent me) {
        msg = " Moving mouse at " + me.getX() + ", " + me.getY();
        repaint();
    }
    @Override
    public void paint(Graphics g) {
        g.drawString(msg, mouseX,mouseY);
    }
}

class MyWindowAdapter extends WindowAdapter {
    public void windowClosing(WindowEvent windowEvent) {
        System.exit(0);
    }
}

