import java.util.*;
public class parentheses{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter your string below:");

		String usr = console.nextLine();

		boolean match = true;
		int count = 0;
		int maxcount =0;
		int len = usr.length();
		for(int i = 0; i < len; i++){
			if(match == false){
				break;
			}
			else{
				int a = usr.charAt(i);
				if(a == '('){
					count++;
					if(count > maxcount){
						maxcount  = count;
					}
				}
				else if(a == ')'){
					count--;
					if (count < 0){
						match = false;
					}
				}
			}
		}
		if (count!=0){
			match = false;
		}
		System.out.println(match);
		if(match == true){
			System.out.println(maxcount);
		}



	}
}