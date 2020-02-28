import java.util.*;
import java.util.Collections;
public class PeopleArrayList{
	public static void main (String[]args){
		ArrayList<PersonArrayList> list = new ArrayList<PersonArrayList>();
		ArrayList<PersonArrayList> sortedlist = new ArrayList<PersonArrayList>();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()){
			String name = scanner.next();
			if(name.equals("stop")){
				break;
			}
			int age = scanner.nextInt();
			double weight = scanner.nextDouble();
			PersonArrayList person = new PersonArrayList(name, age, weight);
			list.add(person);
		}
		//just displays the original lists content
		System.out.println("Original list: ");
		System.out.print("[");

		for(int i = 0;i < list.size(); i++){
			System.out.print(list.get(i));

			if (i < list.size() -1){
				System.out.print(", ");
			}
		}
		System.out.println("]");
		System.out.println();

		sortedlist.addAll(list); //adds all the contents from original	

		//compares and sorts the list using method from person class
		for(int i = 0;i < list.size(); i++){
			for(int j = 0; j<list.size(); j++){
				if(list.get(i).compareTo(list.get(j)) >= 0 && i < j){
					PersonArrayList person2 = list.get(i);
					//sets the object in the correct spot
					list.set(i,list.get(j));
					list.set(j,person2);
				}
			}
			sortedlist.set(i,list.get(i));
		}
		//just displays the sorted lists contents
		System.out.println("Sorted list: ");
		System.out.print("[");
		for(int i = 0; i < list.size(); i++){
			System.out.print(sortedlist.get(i));
			if(i < list.size()-1){
				System.out.print(", ");
			}
		}
		System.out.println("]");
		 
	}
}


		

		
		


/*
Write a program People which reads an input of lines, where each line contains a name (String),
an age (int), and a weight (double), until it reaches a line that contains only the string "stop".
You can safely assume that there will be at least one line of input before the "stop" string.
The program should then store the data in in an ArrayList called People, where each element of
the ArrayList is an Object containing a name, age, and weight. Always add new Objects to the end
of the ArrayList. 
*/






/*
Write a program People which reads an input of lines, where each line contains a name (String),
an age (int), and a weight (double), until it reaches a line that contains only the string "stop".
You can safely assume that there will be at least one line of input before the "stop" string.
The program should then store the data in in an ArrayList called People, where each element of
the ArrayList is an Object containing a name, age, and weight. Always add new Objects to the end
of the ArrayList. 

You'll need to create a separate class called Person with appropriate private variables. You'll
need set and get functions for each variable. The program should loop through the elements of
People and print out the contents of each element separated by a space - yes, it will almost
look exactly like the input!

HOWEVER - Don't take the shortcut of simply redirecting the input to the console output! Why not?
Doing this program correctly will make your life easier when doing Part II of this assignment.

Upload both Person.java and People.java and submit.

Happy Coding!



In Part I of this assignment, you read in lines of information and stored the information in an ArrayList of Person objects. For this part of the assignment, your program needs to sort that ArrayList by implementing the Comparable interface and the compareTo function in your Person class. It then needs to print out the sorted ArrayList.  It must sort the Persons first by forward-alphabetical name, then by increasing age, then by increasing weight in that order. You will print the ArrayList in a different format from Part I. You will need to create a toString() method in your Person class to create the desired output.
*/


