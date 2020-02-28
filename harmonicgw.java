import java.util.*;
public class harmonicgw{
	public static void main(String[] args) {
		
	}

	public static double getSumLimit(){
		

	}
	public static double getNumber(Scanner console, String prompt){
		System.out.println(prompt);
		double usr = console.nextDouble();
		return usr;

	}
	public static double[] harmonicfrac(double usr){
		double sum = 0;
		double n;
		for(n = 1; sum <= usr; n++){
			sum = sum + (1/n);
		}
		n = n-1;
		double[] storage = {sum, n};
		return storage;
	}
}