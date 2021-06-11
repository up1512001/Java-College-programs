package AppletProgram;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/*
<applet code = "MouseDemo" width = 300 height = 300>
</applet>
 */

public class MouseDemo extends Applet implements MouseListener, MouseMotionListener {
    String msg = "";
    int x=0,y=0;

    public void init(){
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    public void mouseClicked(MouseEvent m){
        x = 0;
        y=0;
        msg = "Mouse Clicked...";
        repaint();
    }

    public void mouseEntered(MouseEvent m){
        x = 0;
        y = 20;
        msg = "Mouse Entered...";
        repaint();
    }

    public void mouseExited(MouseEvent m){
        x = m.getX();
        y = m.getY();
        msg = "Mouse Exited...";
        repaint();
    }

    public void mousePressed(MouseEvent m){
        x = m.getX();
        y = m.getY();
        msg = "Mouse Pressed...";
        repaint();
    }

    public  void mouseReleased(MouseEvent m){
        x = m.getX();
        y = m.getY();
        msg = "Mouse Released...";
        repaint();
    }

    public void mouseDragged(MouseEvent m){
        x = m.getX();
        y = m.getY();
        msg = "Mouse Dragging...";
        showStatus("Mouse Dragging from "+ x + ","+y);
        repaint();
    }

    public void mouseMoved(MouseEvent m){
        showStatus("Mouse Moved.. "+m.getX()+" "+m.getY());
    }

    public void paint(Graphics g){
        g.drawString(msg,x,y);
    }
}
