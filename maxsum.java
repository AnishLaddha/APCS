/*
Write a recursive method maxSum that accepts a list of integers, L, and an integer
limit, n, as parameters and uses backtracking to find the maximum sum that can be generated
by adding elements of L that does not exceed n. For example, if you are given the list
[7, 30, 8, 22, 6, 1, 14] and the limit of 19, the maximum sum that can be generated that
does not exceed 19 is 16, achieved by adding 7, 8, and 1. If the list L is empty, or if
the limit is not a positive integer, or all of L’s values exceed the limit, return 0.

Each index’s element in the list can be added to the sum only once, but the same number
value might occur more than once in a list, in which case each occurrence might be added
to the sum. For example, if the list is [6, 2, 1] you may use up to one 6 in the sum, but
if the list is [6, 2, 6, 1] you may use up to two sixes.

List L                      Limit n     Return Value

[7, 30, 8, 22, 6, 1, 14]    19          16
[5, 30, 15, 13, 8]          42          41
[30, 15, 20]                40          35
[10, 20, 30]                7           0
[10, 20, 30]                20          20
[ ]                         10          0

You may assume that all values in the list are nonnegative. Your method may alter the
contents of the list L as it executes, but L should be restored to its original state
before your method returns. Do not use any loops.

Your input should be structured as follows:
{number of elements in array} {array, space separated} {integer limit}

input: 7 7 30 8 22 6 1 14 19
output: 16
*/
import java.util.*;

public class maxsum{
	public static int max;
	public static int limit;

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int size = console.nextInt();
		int[] array = new int[size];
		for(int i = 0; i<size; i++){
			array[i] = console.nextInt();
		}
		limit = console.nextInt;
	}

	
}
