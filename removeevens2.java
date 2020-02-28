
import java.util.*;
import java.io.*;
import java.util.Iterator;

public class removeevens2{
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Removes strings of even length from an array.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter filename for file containing strings: ");
        String s = scan.next();
        System.out.println("Enter two indices for range of odd words to be printed out: ");
        int first = scan.nextInt();
        int last = scan.nextInt();

        Scanner console = new Scanner(new File(s));
        LinkedList<String> list = new LinkedList<String>();
        while(console.hasNext()){
            String hold = console.next();
            list.add(hold);
        }
        System.out.print("initial list.size(): ");
        System.out.println(list.size());
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String element = itr.next();
            if(element.length()%2 == 0){
                itr.remove();
            }
        }
        System.out.print("final   list.size(): ");
        System.out.println(list.size());
        for(int i = first; i <= last; i++ ){
            System.out.println(list.get(i));
        }
    }
}