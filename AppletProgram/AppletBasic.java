package AppletProgram;

import java.applet.Applet;
import java.awt.*;
import java.net.URL;

/*
<applet code = "Applet1",width=200 height=60>
</applet>
*/


public class AppletBasic extends Applet {
    public void paint(Graphics g){
        g.drawString("A simple applet",10,8);
        String msg;
        URL url = getCodeBase();
        msg = "Code Base "+url.toString();
        g.drawString(msg,10,20);
        url = getDocumentBase();
        msg = "Document Base "+url.toString();
        g.drawString(msg,10,40);
    }
}
