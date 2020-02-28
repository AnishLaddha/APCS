import java.util.*;

public class t2a{
	public static void main(String[] args) {
		//System.out.println('a');
		//int charval = (char)'a';
		//System.out.println(charval);
		Scanner console = new Scanner(System.in);  // Create a Scanner object
		int n = console.nextInt();

		int ans = 0;
		for(int j = 1; j <=n; j++){
			String input = console.next();
			for(int i =0; i <input.length(); i++){
				char a = input.charAt(i);
				ans = ans + (char)a;
			}

		}
		System.out.println(ans);
	}
}