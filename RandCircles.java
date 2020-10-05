
import acm.program.*;
import acm.graphics.*;
import acm.util.*;


public class RandCircles extends GraphicsProgram {
	
	/* Constants  */
	
	//Minimum radius
	private static final double MINRAD = 5;
	//Maximum radius
	private static final double MAXRAD = 100;
	//Number of your circles
	private static final int NUMCIRCLES = 50;
			
			
	public void run() {
		for (int i = 0; i < NUMCIRCLES; i++) {
			double rad = randgen.nextDouble(MINRAD, MAXRAD);
			double x = randgen.nextDouble(0, getWidth() - 2 * rad); 
			double y = randgen.nextDouble(0, getHeight() - 2 * rad); 
			GOval circle = new GOval(x, y, 2 * rad, 2 * rad);
			circle.setFilled(true);
			circle.setFillColor(randgen.nextColor());
			add(circle);
		}
		
	}
	
	//Instance variable
	private RandomGenerator randgen = RandomGenerator.getInstance();
}
