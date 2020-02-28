import java.util.*;
public class fencepost{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String word = console.next();
		int len = word.length();
		String fin = "" ;
		for(int i = 0; i < len-1; i++){
			fin = fin + (Character.toString(word.charAt(i))) + "..";
		}
		fin = fin + (Character.toString(word.charAt(len-1)));
		System.out.println(fin);
	}
}