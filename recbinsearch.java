import java.util.*;
public class recbinsearch{
	public static void main(String args[]){
		Scanner console = new Scanner(System.in);
		int size = console.nextInt();
		int[] array = new int[size];
		for(int i = 0;i< size; i++){
			array[i] = console.nextInt();
		}
		int term = console.nextInt();
//		System.out.println(size + " " + term);
		System.out.println(helper(array, term));
	
	}
	public static int helper(int[] arr, int term){
		return binsearch(arr, 0, arr.length-1,term);	
	}

       	public static int binsearch(int[] arr, int start, int end, int term){
		int split = (start + end)/2;
	//	System.out.println(start+", "+end+ ", "+ split);
		if(arr[start] == term){
			return start;
		}
		else if(arr[end] == term){
			return end;
		}
		if(end-start == 0){
			if (arr[end] == term){
				return end;
			}else{
				return -1;
			}
		}else if (end-start == 1){
			if (arr[start]==term){
				return start;
			} else if(arr[end]==term){
				return end;
			}else{
				return -1;
			}
		}else{
			if(arr[split] >= term){
				return binsearch(arr, start, split, term);
			}else{
				return binsearch(arr, split, end, term);
			}
		}
		//return -100;
	}
}	
