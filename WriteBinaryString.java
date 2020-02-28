import java.util.*;
public class WriteBinaryString{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int input = console.nextInt();
		System.out.println(helper(input));
	}
	public static String helper(int usr){
		return writebin(usr,"");
	}
	public static String writebin(int num, String binstr){
		if(num<2){
			return Integer.toString(num%2)+binstr;
		}
		else{
			return writebin((num)/2,Integer.toString(num%2)+binstr);
		}
		
	}
}
