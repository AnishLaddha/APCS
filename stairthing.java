/*
Write a recursive program called mysteryMethod that takes a positive integer representing

a number of stairs and prints (i) each unique way to climb a staircase of that height,

taking strides of one or two stairs at a time, and (ii) the total number of ways.  Do

not use any loops.  Output each way to climb on its own line, using a 1 to indicate a

small stride of 1 stair, and a 2 two indicate a large stride of 2 stairs.



The order in which you report each way to climb is important. Design your recursive

method to produce the order shown in the example.



Example:

Enter the number of stairs to climb (positive integer): 4

[1, 1, 1, 1]

[1, 1, 2]

[1, 2, 1]

[2, 1, 1]

[2, 2]

Total number of ways = 5
*/

import java.util.*;
public class stairthing{
	public static int count;

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int stairs;
		System.out.print("Enter the number of stairs to climb (positive integer): ");
		stairs = console.nextInt();
		helper(stairs);
		System.out.println("Total number of ways = " + count);


	}
	public static void helper(int stairs){
		mysteryMethod(stairs, 0, "");
	}
	public static void mysteryMethod(int stairs, int done, String sizes){
		if(stairs-done ==1){
			count++;
			String s = sizes +(String.valueOf(stairs-done));
			char[] temp = s.toCharArray();
			List<Character> cList = new ArrayList<Character>();
			for(char c : temp) {
    			cList.add(c);
			}
			System.out.println(cList);

		}else if (stairs-done == 2){
			count+=2;
			String s2 = sizes +"11";
			char[] temp2 = s2.toCharArray();
			List<Character> cList2 = new ArrayList<Character>();
			for(char c : temp2) {
    			cList2.add(c);
			}
			System.out.println(cList2);
			String s = sizes +"2";
			char[] temp = s.toCharArray();
			List<Character> cList = new ArrayList<Character>();
			for(char c : temp) {
    			cList.add(c);
			}
			System.out.println(cList);

		}
		else{
			mysteryMethod(stairs,(done+1),sizes+"1");
			mysteryMethod(stairs,(done+2),sizes+"2");
		}
		//return "";
	}
}
