import java.text.DecimalFormat;
import java.lang.Math;

public class Planck{


	public static void main(String[] args){
		//double B =9138471398.76;
		DecimalFormat df1 = new DecimalFormat("0.00E000");
		//System.out.println("radiant flux B = " + df1.format(B).toLowerCase() + " Wm-3steradian-1");
		//double h = 6.626068 * Math.pow(10, -34);
		//double x = B(10e-6, 5800);
		//System.out.println(x);
		double[] waves = new double[]{
			1.0E-7, 
			2.0E-7,
			3.0E-7,
			4.0E-7,
			6.0E-7,
			8.0E-7,
			1.0E-6,
			2.0E-6,
			3.0E-6,
			4.0E-6,
			6.0E-6,
			8.0E-6,
			1.0E-5,
			2.0E-5,
			3.0E-5,
			4.0E-5,
			6.0E-5,
			8.0E-5,
			1.0E-4,
		};
		System.out.println(" Waves | Temp | B value" );
		for (int i = 0; i < waves.length; i++){
//			System.out.println(waves[i]);
			double b1 = B(waves[i], 5800);
			System.out.println(waves[i] + " | " + "5800 | " + df1.format(b1) );
			//double b2 = B(waves[i], 288);
			//System.out.println(df1.format(b1) + "  ----  " +df1.format(b2));

		}
		for (int i = 0; i < waves.length; i++){
//			System.out.println(waves[i]);
			double b2 = B(waves[i], 288);
			System.out.println(waves[i] + " | " + "288 | " + df1.format(b2));
			//double b2 = B(waves[i], 288); 
			//System.out.println(df1.format(b1) + "  ----  " +df1.format(b2));

		}
	}
	


	public static double B(double w, double t) {

		double h = 6.626068e-34, c = 299792500, k = 1.38066e-23;

		// w= wavelength in meters, t = temp in kelvin, rest are constants
		double hc = 2 * h * c * c;
		double w1 = Math.pow(w, -5);
		//w ^ -5 for numerator
		double numerator = hc * w1;
		double power = (h*c)/(w*k*t);
		double denominator = (Math.pow((Math.E),power)) - 1;
		double B = numerator/denominator;
		return B;

	}
//	0.1, 0.2, 0.3, 0.4, 0.6, 0.8, 1, 2, 3, 4, 6, 8, 10, 20, 30, 40, 60, 80, and 100μm
}
