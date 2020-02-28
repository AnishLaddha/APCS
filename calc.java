import java.util.*;

public class calc{
	public static void main(String[] args) {
		System.out.println("");
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter your first  number: ");
		double a = read(console);
		System.out.print("Please enter your second number: ");
		double b = read(console);
		System.out.println("");
		System.out.println("sum        = "+sum(a,b));
		System.out.println("difference = "+subtract(a,b));
		System.out.println("product    = "+mult(a,b));
		System.out.println("quotient   = "+divide(a,b));
		System.out.println("");



	}


	public static double read(Scanner myscan){
		
		return myscan.nextDouble();
	}
	public static double sum(double a, double b){
		return a+b;
	}
	public static double subtract(double a, double b){
		return a-b ;
	}
	public static double mult(double a, double b){
		return a*b;
	}
	public static double divide(double a, double b){
		return a/b;
	}
}