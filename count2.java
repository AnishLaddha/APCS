import java.util.*;
import java.util.Collections;

public class count2{
  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();
    System.out.println();
    System.out.println("Please enter a sequence of strings separated\nby spaces. The end of the sequence must be signified using\nthe sentinel value lastString, followed by a return.\n");


    String s;


    while(console.hasNext()){
      s = console.next();
      if(s.equals("lastString")){
        break;
      }
      list.add(s.toLowerCase());
    }

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
    for(int i = 0; i<list2.size(); i++){
      System.out.print(list2.get(i)+ " ");
      System.out.println(newlist.get(i));
    }





  }
}
