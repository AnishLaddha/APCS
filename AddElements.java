import java.util.*;
public class AddElements{
	public static void main(String Args[]){
		Scanner console = new Scanner(System.in);
		System.out.println("Enter size of integer array: ");
		int size = console.nextInt();
		int[] list = new int[size]; 
		int hold;
		System.out.println("Enter n integers separated by spaces: ");
		for(int i = 0; i < size; i++){
			hold = console.nextInt();
			list[i] = hold;
		}
		System.out.println("The sum of the elements in your list: "+helper(list));
	}

	public static int helper(int[] list){
		return sum(list,0);
	}
	public static int sum(int[] list, int index){
		if(index == list.length){
			return 0;
		}
		else{
			return list[index]+sum(list, index+1);

		}
	}
}
