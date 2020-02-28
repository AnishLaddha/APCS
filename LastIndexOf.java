import java.util.*;
public class LastIndexOf{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int index = -1;
		int[] nums = new int[7];
		System.out.println("Please enter seven elements of an integer array and a value: ");
		for(int i = 0; i < 7; i++){
			int a = console.nextInt();
			nums[i] = a;

		}
		int value = console.nextInt();
		for(int i = 0; i < 7; i++){
			if(nums[i] == value){
				index = i;
			}
		}
		System.out.println("Last index of value = " + index);
	}
}