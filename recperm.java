import java.util.*;
public class recperm{
	public static TreeSet<String> ts = new TreeSet<String>();

	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		System.out.println("Input string: ");
		String input = console.next();
		permutations(input.toCharArray(), 0);
		//System.out.println(ts);
		for (String word : ts){
			System.out.println(word);
		}

	}
	private static void swapper(char[] ch, int i, int j){
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	} 
	private static void permutations(char[] ch, int index){
		if(index == ch.length -1){
			ts.add(String.valueOf(ch));

		}
		for(int i = index; i < ch.length; i++){
			swapper(ch, index, i);
			permutations(ch, index +1);
			swapper(ch, index, i);
		}
	}
}
