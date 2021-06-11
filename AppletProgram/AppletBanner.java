package AppletProgram;

import java.applet.Applet;
import java.awt.*;

import static java.lang.Thread.sleep;

/*
<applet code ="AppletBanner" width=400 height=40>
</applet>
 */

public class AppletBanner extends Applet implements Runnable{
    String msg = "Hello my name is UTSAV";
    Thread t = null;
    boolean flag;

    @Override
    public void init() {
        setBackground(Color.BLACK);
        setForeground(Color.GREEN);
    }

    public void start(){

        if(msg == null){
            msg = "Message not found...";
        }
        msg = " "+msg;
        t = new Thread(this);
        flag = false;
        t.start();
    }

    public void run(){
        char c;
        for(;;){
            try{
                repaint();
                sleep(400);
                c = msg.charAt(0);
                msg = msg.substring(1);
                msg = msg + c;
                if(flag){
                    break;
                }
            }catch (InterruptedException e){
                System.out.println("Got :->"+e);
            }
        }
    }

    public void stop(){
        flag = true;
        t = null;
    }

    public void paint(Graphics g){
        g.drawString(msg,50,50);
    }
}
