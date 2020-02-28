import java.util.*;
public class goats{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		boolean brick = false;
		int prev = 0;
		int usr = 0;
		int count = 0;
		while(brick == false){
			usr = console.nextInt();
			if(usr == -1){
				brick = true;
			}
			else{
				if(prev == 0){
					prev = usr;
				}

				if(usr < prev){
					System.out.println(count);
				}

				prev = usr;
				count++;

			}
		}
	}
}