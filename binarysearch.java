import java.util.*;
public class binarysearch{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("Enter number of elements in array: ");
		int num = console.nextInt();
		System.out.println("Enter "+num+" integers and the element to be searched: ");
		int[] terms = new int[num];
		for(int i = 0; i < num; i++){
			int hold = console.nextInt();
			terms[i] = hold;
		}
		int value = console.nextInt();
		int key = search(terms, value, 0, num-1);
		if(key == Integer.MAX_VALUE){
			System.out.println("value "+value+" not found");
		}
		else{
			System.out.println("value "+value+" found at index "+key);
		}
		
	}
	public static int search(int[] array, int key, int low, int high){
		int index = Integer.MAX_VALUE;
		while(low<=high){

			int mid = (low+high)/2;
			if(array[mid] < key){
				low = mid + 1;
			} else if(array[mid] > key){
				high= mid-1;
			}else if(array[mid] == key){
				index = mid;
				break;
			}

		}
		return index;
	}
}