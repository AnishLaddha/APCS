import java.util.*;
import java.util.HashMap;
import java.util.Map;
public class hashmap1{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		HashMap<String, Long> map = new HashMap<>();
		int first = console.nextInt();
		int second = console.nextInt();
		int fav = console.nextInt();
		String s;

		long sub;
		for(int i = 0; i < first; i++){
			s = console.next();
			sub = (long)console.nextInt();
			map.put(s,sub);

		}
		for(int i = 0; i < second; i++){
			s = console.next();
			sub = (long) console.nextInt();
			long a = map.get(s);
			map.put(s,(a+sub));
		}
		long sum = 0;
		for(int i = 0; i < fav; i++){
			s = console.next();
			sum+=(map.get(s));
		}
		sum = sum %(1000000007);
		System.out.println(sum);

	}
}
