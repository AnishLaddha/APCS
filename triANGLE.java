import java.util.*;
public class triANGLE{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("length of side a? ");
		double a = console.nextDouble();
		System.out.println("length of side b? ");
		double b = console.nextDouble();
		System.out.println("length of side a? ");
		double c = console.nextDouble();
		System.out.println("angle A = "+ lawcos(a,b,c));
		System.out.println("angle B = "+ lawcos(b,a,c));
		System.out.println("angle B = "+ lawcos(c,b,a));
		System.out.println("area    = "+ area(a,b,c));





	}
	public static double lawcos(double side, double a, double b){
		double cosc = ((a*a)+(b*b)-(side*side))/(2*a*b);
		double angrC = Math.acos(cosc);
		double angC = Math.toDegrees(angrC);
		return angC;
	}
	public static double area(double a, double b, double c){
		double s = (a +b + c)/2;
		double asqr = s * (s-a) * (s-b) * (s-c);
		double area = Math.sqrt(asqr);
		return area;
	}
}