public class PersonArrayList implements Comparable<PersonArrayList>{
	private String name;
	private int age;
	private double weight;

	public PersonArrayList(String name, int age, double weight){
		this.name = name;
		this.age = age;
		this.weight = weight;
	}

	public String getName(){
		return this.name;
	} 

	public void setName(String name){
		this.name = name;
	}

	public int getAge(){
		return this.age;
	}

	public void setAge(int age){
		this.age = age;
	}

	public double getWeight(){
		return this.weight;
	}

	public void setWeight(double weight){
		this.weight = weight;
	}

	public int compareTo(PersonArrayList nextname){
		if (name.compareTo(nextname.getName()) == 0){
			if(age == nextname.getAge()){
				return (int)(weight - nextname.getWeight());
			} else {
				return age - nextname.getAge();
			}
		} else {
			return name.compareTo(nextname.getName());
		}
	}

	public String toString (){
		return "{" + name + ", " + age + ", " + weight + "}";
	}

}





























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
*/