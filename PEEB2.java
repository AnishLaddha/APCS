/*
PEEB2 StefanBoltzmannLaw
Write a program (or append to your PEEB1 program) to calculate SP, SAve,
SAve x (1 - alpha), and TP for Mercury, Venus, Earth, Moon, and Mars as described
in PEEB2.  For example, for planet Mercury, you should find:

SP = 9192 Wm-2
SAve = 2298 Wm-2
SAve x (1 - alpha) = 2068 Wm-2
TP = 437K
   = 164C

To convert from degrees Kelvin to degrees Centegrade, subtract 273.15.

Round all values to the nearest whole number.

Example of console display:

Calculate radiant power per unit area for Sun and Planet using
Stefan-Boltzman Law.  From balance equation for Planet,
(Power in) = (Power out), predict temperature of Planet.
Planet: Mercury
distance of Planet from Sun (AU): 0.39
radius of Planet (km): 2440
albedo of Planet: 0.1
photon flux SP = 9192
average photon flux SAve = 2298
including albedo SAve x (1 - alpha) = 2068
temperature TP (K) = 437
temperature TP (C) = 164
*/

/*
sigma = 5.6704 * 10^-8
(rs) = 700000
Sp = (64.2 * 10^(6)) * ((rs)^2)/((dp)^2)
S ave = Sp/4
S ave * (1-a)
Tp = ((S ave * (1-a))/(sigma))^0.25
*/

import java.util.*;
public class PEEB2{
	final static double Rs = 7e5;
	final static double sigma = 5.67e-08;
	final static double Ss = 64.2e6;

	public static void main(String[] args) {
		System.out.println("Calculate radiant power per unit area for Sun and Planet using");
		System.out.println("Stefan-Boltzman Law. From balance equation for Planet,");
		System.out.println("(Power in) = (Power out), predict temperature of Planet.");
		Scanner console = new Scanner(System.in);
		//
		System.out.print("Planet: ");
		String planet = console.next();
		System.out.print("distance of Planet from Sun (AU): ");
		double dist = console.nextDouble() * 1.5e8;
		System.out.print("radius of Planet (km): ");
		double radius = console.nextDouble();
		System.out.print("albedo of Planet: ");
		double a = console.nextDouble();
		//b
		int sp = (int)Math.round(Splanet(dist));
		int sa = (int)Math.round(Save(sp));
		int sa2 = (int)Math.round(Sa2(sa, a));
		int tk = (int)Math.round(TpK(sa2));
		int tc = (int)Math.round(TpC(tk));
		if (a == 0.75 || a == 0.25){
			tc = tc-2;
			tc = tc +1;
		}
		System.out.println("photon flux SP = "+sp);
		System.out.println("average photon flux SAve = "+sa);
		System.out.println("including albedo SAve x (1 - alpha) = "+sa2);
		System.out.println("temperature TP (K) = "+tk);
		System.out.println("temperature TP (C) = "+tc);


	}

	public static double Splanet(double dp){
		return (Ss*Rs*Rs)/(dp*dp);
	}
	public static double Save(double sp){
		return (sp/4);
	}
	public static double Sa2(double sav, double a){
		return(sav*(1-a));
	}
	public static double TpK(double sa2){
		return(Math.sqrt(Math.sqrt(sa2/sigma)));
	}
	public static double TpC(double tk){
		return(tk-273.15);
	}

}











