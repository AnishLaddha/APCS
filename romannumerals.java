import java.util.*;
public class romannumerals{

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		int start = console.nextInt();
		int finish = console.nextInt();
		for(int i = start; i <= finish; i++){
			System.out.println(convert(i));
		}
	}
	public static String convert(int usr){

		String th[] = {"", "M", "MM", "MMM"};
		String hu[] = {"", "C","CC","CCC","CD", "D", "DC", "DCC", "DCCC", "CM"};
		String te[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		String on[] = {"", "I", "II", "III", "IV", "V","VI","VII", "VIII", "IX"};
		String d4 = "";
		for (int n = 0; n < (usr%10000)/1000;n++){
			d4 = d4 + "M";
		}
		//String d4 = th[(usr%10000)/1000];
		String d3 = hu[(usr%1000)/100];
		String d2 = te[(usr%100)/10];
		String d1 = on[usr%10];
		return (d4+d3+d2+d1);
	}
}