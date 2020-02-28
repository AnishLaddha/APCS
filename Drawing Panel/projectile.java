import java.awt.*;
import java.awt.geom.Path2D;
import java.util.*;


public class projectile{
	public static final double v0 = 30.0;
	public static final double g = 9.81;

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("angle?: ");

		double[] x = new double[100];/* x coordinates of polyline */;
		double[] y = new double[100];/* y coordinates of polyline */;

		double thetaD = console.nextDouble();

		double thetaR = Math.toRadians(thetaD);

		double v0x = v0 * Math.cos(thetaR);

		double v0y = v0 * Math.sin(thetaR);

		double time = (2*v0y)/g;

		for(int i = 0; i <100; i++){
			x[i] = 5*v0x * i* (time/100);
			y[i] = 600- 5*((v0y * i * (time/100))-(0.5*g* (i * (time/100))* (i * (time/100))));

		}

		for (int n = 0; n < 100; n++){
			System.out.println(x[n]+ " "+ y[n]);
		}






		DrawingPanel panel = new DrawingPanel(1000,600);
		Graphics2D graphics = panel.getGraphics();;

		Path2D polyline = new Path2D.Double();
		polyline.moveTo(x[0], y[0]);
		for (int i = 1; i < x.length; i++) {
    		polyline.lineTo(x[i], y[i]);
		}

		graphics.draw(polyline);
	}
}