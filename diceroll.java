import java.util.*;
public class diceroll{
	public static void main(String[] args) {
		System.out.println("");
		Random r = new Random();
		Scanner console = new Scanner(System.in);
		System.out.print("Enter desired sum of two dice: ");
		int sum = console.nextInt();
		System.out.print("Enter number of rolls: probability: ");
		int roles = console.nextInt();
		int count = 0;
		for(int i = 0; i < roles; i++){
			int die1 = r.nextInt(6) + 1;
			int die2 = r.nextInt(6) + 1; 
			int dieT = die1 + die2;
			if(dieT == sum){
				count++;
			}
		}
		double prob = (double)count/(double) roles;
		prob = ((double)Math.round(prob * 100))/ 100;
		System.out.println(prob);
	}
}