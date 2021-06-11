package AppletProgram;

import java.applet.Applet;
import java.awt.*;
import java.net.URL;

/*
<applet code ="DocAndCodeBase" width = 500,height=50>
</applet>
 */

public class DocAndCodeBase extends Applet {
    @Override
    public void paint(Graphics g){
        String msg;
        URL url = getCodeBase();
        msg = "Code Base :-> "+url.toString();
        g.drawString(msg,40,30);
        url = getDocumentBase();
        msg = "Document Bsse :-> "+url.toString();
        g.drawString(msg,40,45);
    }
}
