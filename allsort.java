import java.util.*;
public class allsort{
	public static void main(String[] args) {
		//System.out.println("bubbleSort");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Scanner console = new Scanner(s);
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(console.hasNext()){
			array.add(console.nextInt());
		}

		int[] arr = array.stream().mapToInt(Integer::intValue).toArray();
		int[] bubarr = arrcreate(arr);
		int[] selectarr = arrcreate(arr);
		int[] insertarr = arrcreate(arr);
		int[] mergearr = arrcreate(arr);
		bubblesort(bubarr);
		System.out.println("selectionSort");
		System.out.println(array);
		selectsorter(array);
		System.out.println();

		insertsort(insertarr);
		System.out.println();
		System.out.println("mergeSort");
		System.out.println(Arrays.toString(mergearr));
		mergeSort(mergearr, mergearr.length);
		System.out.println(Arrays.toString(mergearr));



	}
	public static int[] arrcreate(int[] a){
		int[] b = new int[a.length];
		for(int i = 0; i<a.length; i++){
			int hold = a[i];
			b[i] = hold;
		}
		return b;
	}
	public static void bubblesort(int[] arr) {
		System.out.println("bubbleSort");
		int n = arr.length;
		System.out.println(Arrays.toString(arr));
		int temp = 0;
		 for(int i=0; i < n-1; i++){
			for(int j=1; j < (n-i); j++){
				if(arr[j-1] > arr[j]){
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}

			}
			System.out.println(Arrays.toString(arr));
		 }
		 System.out.println();

	}
	public static void insertsort(int[] array) {

		System.out.println("insertionSort");
		System.out.println(Arrays.toString(array));
		int n = array.length;
		for (int j = 1; j < n; j++) {
			int key = array[j];
			int i = j-1;
			while ( (i > -1) && ( array [i] > key ) ) {
				array [i+1] = array [i];
				i--;
			}

			array[i+1] = key;
			System.out.println(Arrays.toString(array));
		}
	}
	public static void merge(int[] a, int[] l, int[] r, int left, int right) {
		int i = 0, j = 0, k = 0;
		while (i < left && j < right) {
			if (l[i] <= r[j]) {
				a[k++] = l[i++];
			}
			else {
				a[k++] = r[j++];
			}
		}
		while (i < left) {
			a[k++] = l[i++];
		}
		while (j < right) {
			a[k++] = r[j++];
		}
	}
	public static void mergeSort(int[] a, int n) {
		if (n < 2) {
			return;
		}
		int mid = n / 2;
		int[] l = new int[mid];
		int[] r = new int[n - mid];

		for (int i = 0; i < mid; i++) {
			l[i] = a[i];
		}
		for (int i = mid; i < n; i++) {
			r[i - mid] = a[i];
		}
		mergeSort(l, mid);
		mergeSort(r, n - mid);
		merge(a, l, r, mid, n - mid);
	}

	public static void selectsorter(ArrayList<Integer> arr){
		for(int i = 0; i<arr.size()-1; i++) {
    		int low = arr.get(i);
			int lowindex = i;
    		for(int j = i+1; j<arr.size();j++) {
        		if(low > arr.get(j)) {
					low = arr.get(j);
					lowindex = j;
				}
     		}
		int temp = 	arr.get(i);
		arr.set(lowindex, temp);
		arr.set(i, low);
		System.out.println(arr);
		}
	}



}
