import java.util.*;
public class sigfig{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.print("enter any number, integer or decimal: ");
		String usr = console.next();
		boolean decimal = false;
		int len = usr.length();
		boolean numstart = false;
		int sigfig = 0;
		int bz = 0;
		for(int i = 0; i < len; i++){
			char n = usr.charAt(i);
			int num = 11;
			if(n !='.'){
				num=Character.getNumericValue(n);
			}
			if(n != '0' && n != '.'){
				numstart = true;
				sigfig++;
			}
			
			else if(n == '0'){
				if (numstart == true){
						sigfig++;
						bz++;
				}
			}
			else if(n == '.'){
				decimal = true;

			}
		}

		if (decimal == false){
			sigfig -= bz;
		}

		if (usr.charAt(len-1)== '.'){
			sigfig = len-1;
		}
		if (decimal == false && usr.charAt(0) != '0' 
			&&usr.charAt(len-1) != '.' && usr.charAt(len-1) != '0'	){
			sigfig = len;

		}


		System.out.println(sigfig);
	}
}