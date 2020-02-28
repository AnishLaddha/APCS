import java.awt.*;
import java.util.*;
import java.awt.geom.*;
import java.awt.event.*;
import javax.swing.*;


public class colorwheel{
	public static void main(String[] args) {


		DrawingPanel panel = new DrawingPanel(512,512);

		Graphics graph = panel.getGraphics();

		int height = 256;
		int width = 256;
		//int hue=0;
		//int sat = 1;
		//int lum = 1;



		//g.drawOval(width/2,height/2, width, height);
		// g.setColor(Color.BLUE);
		// g.fillArc(width/2,height/2,width, height, 1, 2);
		// g.setColor(Color.GREEN);

		// g.fillArc(width/2,height/2,width, height, 2, 3);
		// g.setColor(Color.YELLOW);

		// g.fillArc(width/2,height/2,width, height, 3, 4);

		
		
			//System.out.println(n);
			
			for(int i =0; i <360; i++){

				double[] rgb = HSL_RGB((double)i%360, 1, 0.5);
				double r1 = rgb[0];
				double g1 = rgb[1];
				double b1 = rgb[2];

				int r = (int)(Math.round(r1));
				int gr = (int)(Math.round(g1));
				int b = (int)(Math.round(b1));

				Color c = new Color(r,gr,b);
				graph.setColor(c);
				graph.fillArc(width/2,height/2,width, height,(i)%360, 1);
				//System.out.println(i);

			//System.out.println("RGB at "+i+","+(i+1)+": "+r+", "+gr+", "+b);

			}

			
		
		



	}
	public static double[] HSL_RGB(double hue, double sat, double lum){
		double c = (1-Math.abs((2*lum) - 1)) * sat;
		double h = Math.abs(hue/60);
		double x = c * (1-Math.abs((h%2)-1));
		if (0 <= h & h <= 1){
			double[] a = {c*255,x*255,0};
			return a;

		}
		else if (1 < h & h <= 2){
			double[] a = {x*255,c*255,0};
			return a;
		}
		else if (2 < h & h <= 3){
			double[] a = {0,c*255,x*255};
			return a;
		}
		else if (3 < h & h <= 4){
			double[] a = {0,x*255,c*255};
			return a;
		}
		else if (4 < h & h <= 5){
			double[] a = {x*255,0,c*255};
			return a;
		}
		else if (5 < h & h <= 6){
			double[] a = {c*255,0,x*255};
			return a;
		}
		else{
			double[] a = {0,0,0};
			return a;
		}

	}





}