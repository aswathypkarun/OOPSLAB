import java.applet.*;
import java.awt.*;
public class appletprgm extends Applet {
    public void paint(Graphics g)
    {
	g.setColor(Color.green);
        g.fillOval(0, 0, 170, 170);
			
	g.setColor(Color.yellow);
	g.fillRect(150, 200, 170, 175);
			
	int xPoints[] = {250,320,170,250};
	int yPoints[] = {100,150,150,100};
			  
	g.setColor(Color.red);
	g.fillPolygon(xPoints, yPoints, 4);
			
    }
}