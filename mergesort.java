import java.util.*;
import java.io.*;

public class mergesort{
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
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int[] array = new int[10];
		int hold;
		for(int i = 0; i <10; i++){
			hold = console.nextInt();
			array[i] = hold;
		}
		System.out.println("mergeSort");
		System.out.println(Arrays.toString(array));
		mergeSort(array, array.length);
		System.out.println(Arrays.toString(array));

	}
}
