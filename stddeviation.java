import java.util.*;
public class stddeviation{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Please enter the integer array dimension: ");
		int terms = console.nextInt();
		int[] values = new int[terms];
		System.out.println("Please enter the array elements: ");

		int val;

		for(int i = 0; i < terms; i++){
			val = console.nextInt();
			values[i] = val;
		}
		int sum=0;
		for(int i = 0; i < terms; i++){
			sum += values[i];
		}
		double mean = (double)sum/(double)terms;
		double[] list2 = new double[terms];
		for(int i = 0; i < terms; i++){
			double v = (double) values[i];
			list2[i] = (v-mean) * (v-mean);
		}
		double sum2 = 0;
		for(int i =0; i < terms; i++){
			sum2 += list2[i];
		}
		double std = Math.sqrt(sum2/(double)(terms-1));
		System.out.println("Standard deviation = "+(double)(Math.round(std*1000))/1000);

	}
}