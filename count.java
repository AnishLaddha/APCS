import java.util.*;
import java.util.Collections;

public class count{
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    System.out.println();
    System.out.println("Please enter an alphabetical sequence of strings separated");
    System.out.println("by spaces. The end of the sequence must be signified using");
    System.out.println("the sentinel value lastString, followed by a return.");
    System.out.println();
    System.out.println();
    String s;

    
    while(console.hasNext()){
      s = console.next();
      if(s.equals("lastString")){
        break;
      }
      list.add(s.toLowerCase());
    }
    System.out.print("Your original list: ");
    System.out.println(list);
    ArrayList<String> list2 = new ArrayList<>();
    ArrayList<Integer> newlist = new ArrayList<>();
    String str;

    for(int i = 0; i < list.size(); i++){
      str = list.get(i);
      if (list2.contains(str) == false){
        int number = Collections.frequency(list, str);
        list2.add(str);
        newlist.add(number);
      }

    }
    Collections.sort(newlist);


    System.out.print("Count: ");
    System.out.println(newlist);




  }
}
