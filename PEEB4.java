import java.util.*;
public class PEEB4{
	public static void main(String[] args) {
		//prints out required strings
		System.out.println("Calculate surface temperature as a function of");
		System.out.println("emissivity for the single-layer atmosphere model.");
		System.out.print( "enter emissivity: ");
		Scanner scanner = new Scanner(System.in);
		double em = scanner.nextDouble();
		System.out.printf("emissivity (= absorptivity) = %,.1f%n", em);

		//formula for calculating surface temperature using the emissivity given aboe
		double ans = Math.pow(((2*(1-0.30)*342)/(5.67 *Math.pow(10,-8) * (2 - em))),0.25);


		System.out.printf("surface temperature = %.0fK%n", ans);
	}
}