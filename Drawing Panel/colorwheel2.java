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

		
		int n =0;
		//counter

		while(n < 3600){
			//limit for how long it lasts, in milliseconds
		// try{
  //   			Thread.sleep(1);
  //   			//pause for 1 millisecond
  //   		}
  //   		catch(InterruptedException ex){
  //   			Thread.currentThread().interrupt();
  //   		}
			for(int i =0; i <360; i++){
				//forms circle

				double[] rgb = HSL_RGB((double)i%360, 1, 0.5);
				double r1 = rgb[0];
				double g1 = rgb[1];
				double b1 = rgb[2];
				//get rgb values

				int r = (int)(Math.round(r1));
				int gr = (int)(Math.round(g1));
				int b = (int)(Math.round(b1));

				Color c = new Color(r,gr,b);
				//new color
				graph.setColor(c);
				graph.fillArc(0,0,width, height,(i+n)%360, 1);
				//upper left circle
				graph.fillArc(256,0,width, height,(i+n)%360, 1);
				//upperright
				graph.fillArc(236,236,40, 40,(i+n)%360, 1);
				//tiny middle




			}
			graph.setColor(Color.BLACK);
			for(int i =0; i <180; i++){
				graph.fillArc(128,384,width, 256,i, 1);
			}
			//makes the small 1/2 circle

			n++;
			//increase counter
		}


		



	}
	public static double[] HSL_RGB(double hue, double sat, double lum){

		/* this method converts HSL Values to RGB. It returns a RGB as a double[], where r is [0],
		green is [1], so on*/
		double c = (1-Math.abs((2*lum) - 1)) * sat;
		// c = chroma value
		double h = Math.abs(hue/60);
		double x = c * (1-Math.abs((h%2)-1));
		//Equation based on wikipedia
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