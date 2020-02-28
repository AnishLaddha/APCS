import java.util.*;
public class spell{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String input = console.nextLine();
		int upper = 0;
		int lower = 0;
		int other = 0;
		int len = input.length();
		for(int i = 0; i < len; i++){
			char letter = input.charAt(i);
			int let = (int) letter;
			if(let >= 65 && let <= 90){
				upper++;
			}
			else if(let >= 97 && let <= 122){
				lower++;
			}
			else{
				other++;
			}
		}
		System.out.println(upper);
		System.out.println(lower);
		System.out.println(other);
	}
}