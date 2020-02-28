import java.util.*;
public class greatdev{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		int terms = console.nextInt();
		int[] values = new int[terms];

		int val;
		double max = -1000000;
		int maxi = -12231312;

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
			list2[i] = Math.abs((v-mean));
		}
		for(int i =0; i < terms; i++){
			if(list2[i] > max){
				max = list2[i];
				maxi = i;
			}
		}
		System.out.println(values[maxi]);
		

	}
}