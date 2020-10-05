
import acm.program.*;
import acm.graphics.*;
import java.awt.event.*;


//Draw lines on the canvas
public class DrawLines extends GraphicsProgram {

	public void run() {
		
		//waits for mouse interaction then calls appropriate methods
		addMouseListeners();
	}
	
	//if mouse pressed create the line
	public void mousePressed(MouseEvent ev) {
		double x = ev.getX();
		double y = ev.getY();
		line = new GLine(x, y, x, y);
		add(line);
		
	}
	
	//reset the endpoint as mouse dragged
	public void mouseDragged(MouseEvent ev) {
		double x = ev.getX();
		double y = ev.getY();
		line.setEndPoint(x, y);
	}
	
	//instance variable
	private GLine line;
}
