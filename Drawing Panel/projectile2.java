import java.awt.*;
import java.awt.geom.Path2D;
import java.util.*;


public class projectile2{
	public static final double v0 = 30.0;
	public static final double g = 9.81;

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.print("initial angle?: ");
		double theta1D = console.nextDouble();
		System.out.print("final angle?: ");
		double theta2D = console.nextDouble();
		System.out.print("Step?: ");
		double step = console.nextInt();



		DrawingPanel panel = new DrawingPanel(1000,600);
		Graphics2D graphics = panel.getGraphics();

		graphics.setFont(new Font("Monospaced",Font.BOLD + Font.ITALIC, 36));
        graphics.drawString("Projectile Motion:", 40, 80);
		


		double[] x = new double[100];/* x coordinates of polyline */;
		double[] y = new double[100];/* y coordinates of polyline */;



		for(double n = theta1D; n <= theta2D; n+=step){
			double thetaR = Math.toRadians(n);

			double v0x = v0 * Math.cos(thetaR);

			double v0y = v0 * Math.sin(thetaR);

			double time = (2*v0y)/g;

			for(int i = 0; i <100; i++){
				x[i] = 10*v0x * i* (time/100);
				y[i] = 600- 10*((v0y * i * (time/100))-(0.5*g* (i * (time/100))* (i * (time/100))));

			}
			Path2D polyline = new Path2D.Double();
			polyline.moveTo(x[0], y[0]);
			for (int i = 0; i < x.length; i++) {
    			polyline.lineTo(x[i], y[i]);
			}
			graphics.setFont(new Font("SansSerif",Font.ITALIC, 10));
        	graphics.drawString("proj: "+n+" deg", (int)(x[(x.length/2)-1]), 600- 10*(int)((v0y*v0y)/(2*g)));



			graphics.draw(polyline);

		}
		
	}
}