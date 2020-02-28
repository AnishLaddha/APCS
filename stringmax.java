import java.util.*;
public class stringmax{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter string: ");
		String string = console.next();
		char[] chars = string.toCharArray();
		
		Arrays.sort(chars);

		System.out.println("max char:     " + ( chars[chars.length-1]));
		System.out.print("in order:     ");
		for(int n = 0; n < chars.length; n++){
			System.out.print( chars[n]);
		}
		System.out.println("");
	}
}