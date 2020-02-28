import java.util.*;
public class revarray{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		int terms = console.nextInt();
		int[] usr = new int[terms];
		for(int i = 0; i < terms; i++){
			usr[i] = console.nextInt();
		}
		int[] ok = reverse(usr,terms);
		System.out.print("["+ok[0]+",");
		for(int i =1; i <= terms-2; i++){
			System.out.print(" "+ok[i]+",");
		}
		System.out.print(" "+ok[terms-1]+"]");
		
	}
	public static int[] reverse(int[] nums, int len){
		int[] fin = new int[len];
		for(int i = len-1; i >= 0; i--){
	//		System.out.println(i);
			int j = len-i-1;
			fin[j]=nums[i];
			
		}
		return fin;
	}
}