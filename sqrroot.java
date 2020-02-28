import java.util.*;
public class sqrroot{
	public static void main(String[] args) {
//x[n+1] = 0.5(x[n]+a/x[n])

		Scanner console = new Scanner(System.in);
		System.out.println("Raw Grade: ");
		double a = console.nextDouble();
		double x;
		
		if(a < 0){
			a = a*-1;
			x = a;
			int count = 1;
			while((x*x)-(a) > 1e-15){
			 	count++;
				double i = 0.5*(x+(a/x));
				x = i;
			}
			System.out.println("Original = " + a*-1);
			System.out.println("iterations to get root: "+ count);
			System.out.println("Sqr root curve= " + x +"i");
			System.out.println("Grade: F");
		}
		else if(0 <= a && a <= 1){
			a = a *100;
			x = a;
			int count = 1;
			while((x*x)-(a) > 1e-13){
				count++;
				double i = 0.5*(x+(a/x));
				x = i;
			}
			System.out.println("Original = " + a/100);
			System.out.println("iterations to get root: "+ count);
			System.out.println("Sqr root curve= " + ((double)Math.round(x * 100d) / 100d)/10);
			System.out.println("Grade: F");

		}
		else if (a > 1){
			x = a;
			int count = 1;
			while((x*x)-(a) > 1e-13){
				count++;
				double i = 0.5*(x+(a/x));
				x = i;
			}
			System.out.println("iterations to get root: "+ count);
			
			x = x *10;
			

			

			System.out.println("Sqr root curve= " + (double)Math.round(x * 100d) / 100d);
			//s
			char pm;
			int digit = ((int) x)%10;
			if (0 <= digit && digit < 3){
				 pm = '-';
			}
			else if (3 <= digit && digit < 7){
				 pm = ' ';
			}
			else if (7 <= digit && digit < 10){
				 pm = '+';
			}
			else{
				pm = ' ';
			}
			//seperator
			char g;
			if(x >= 100){
				 g = 'A';
				 pm = '+';
			}
			else if (90 <= x && x < 100){
				 g = 'A';
			}
			else if (80 <= x && x < 90){
				 g = 'B';
			}
			else if (70 <= x && x < 80){
				 g = 'C';
			}
			else if (60 <= x && x < 70){
				 g = 'D';
			}
			else{
				 g = 'F';
				 pm = ' ';
			}

			//put it all together
			System.out.println("Grade: " + g + pm);
		}
		else{
			System.out.println("bro how did u even manage to get here");
			System.out.println("like seriously doe");
		}
		
		
	}
	
}