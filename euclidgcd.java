import java.util.*;
public class euclidgcd{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter positive integer a: ");
		int a = console.nextInt();
		System.out.println("Enter positive integer b: ");
		int b = console.nextInt();
		int ans = gcd(a,b);
		System.out.println("Greatest common divisor (GCD) = "+ans);

	}
	public static int gcd(int a, int b){
		int x;
		int y;
		while(b != 0){
			x = a;
			y = b;
			a = y;
			b = x % y;
		}
		return a;
	}
}