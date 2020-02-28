import java.util.*;
public class calculator{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		String usr = console.next();
		int len = usr.length();
		double ans = (double)(Integer.valueOf(usr.substring(0,1)));
		for(int i = 2; i < len; i+=2){
			char op = usr.charAt(i-1);
			double newv = Integer.valueOf(usr.substring(i, i +1));
			ans = operate(ans,newv,op);

		}
		System.out.printf("%.2f",ans);
		System.out.println("");
		
	}


	public static double operate(double as, double newval, char oper){
		switch(oper){
			case '+':
				return as+newval;
			case '-':
				return as - newval;
			case '*':
				return as * newval;
			case '/':
				return as/newval;
			case '^':
				return Math.pow(as, newval);
		}
		return 0.1;
	}

}
/*
Integer.valueOf (substring(0,1))
for (int i=3;i<length input;i+=2)



method(int x, int y, char operation)
	switch(char '+-){
		case '+':
			return x+y;
		case '-':
			...
}
*/

