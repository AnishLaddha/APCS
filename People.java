import java.util.*;
public class People{
	public static void main(String[] args){
		Scanner console = new Scanner(System.in);
		ArrayList<String> arrlist = new ArrayList<>();
		Boolean flag = true;
		String string;
		String space = " ";
		Person p = new Person();
		while (flag){
			string = console.nextLine();
			if (string.equals("stop")){
				flag = false;
			}

			else{
				arrlist.add(string);
			}
		}
		for(String i : arrlist){
			String split[] = i.split(" ");
			//System.out.println(Arrays.toString(split));
			p.setName(split[0]);
			p.setAge(Integer.parseInt((split[1])));
			p.setWeight(Double.parseDouble(split[2]));
			System.out.println(p.toString());
		}
	}
}