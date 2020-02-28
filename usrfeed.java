import java.util.*;
public class usrfeed{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("number of trials: ");
		int trials = console.nextInt();
		System.out.println("finished trial number: ");

		for(int i = 1; i <= 10; i++){
			System.out.println("                       "+((trials/10)*i));

		}
		}
	}
