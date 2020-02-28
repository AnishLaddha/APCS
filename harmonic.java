import java.util.*;
public class harmonic{
	public static void main(String[] args) {
		//Scanner console = new Scanner(System.in);
		//double usr = console.nextDouble();
		double usr = 1;
		while(usr < 11){
			final long startTime = System.nanoTime();
			double[] sandn =  harmonicfrac(usr);
			final long endTime = System.nanoTime();
			double sum = sandn[0];
			//sum = ((int)(sum*10000))/10000;
			double n = sandn[1];
			long time = endTime-startTime;
			
			double aTime = (((double) time) * (10e6))/(n);
			//aTime = ((double)((int)(aTime*1000)))/1000;
			System.out.print("|  ");
			System.out.printf("%8.2e", usr);
			System.out.print("  |  ");
			System.out.printf("%8.2e", sum);
			System.out.print("  |  ");

			System.out.printf("%8.2e", n);
			System.out.print("  |  ");
			System.out.printf("%9d", time);
			System.out.print("  |  ");
			System.out.printf("%8.2e", aTime);
			System.out.print("  |");
			System.out.println("");

			//System.out.print(usr + "  " + sum +" "+ n+ " " + time + " " + aTime);
			usr++;
		}

			
		//System.out.print("Actual sum = "+sum);
		
		//System.out.printf("%.5f", sum);
		//System.out.println("");

		//System.out.println("Number of terms required: " + (int)n);
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