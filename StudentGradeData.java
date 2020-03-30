import java.util.*;
import java.io.*;
import java.lang.*;


class StudentGradeData{

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Enter student data file name: ");
		ArrayList<Student> students = new ArrayList<>();
		Scanner input = new Scanner(System.in);
		String filename = input.next();
		//System.out.println();

		Scanner console = new Scanner(new File(filename));
		String lastname;
		String firstname;
		String studentid;
		float percentgrade;
		String lettergrade;
		while(console.hasNextLine()){
			lastname = console.next();
			firstname = console.next();
			studentid = console.next();
			percentgrade = console.nextFloat();
			lettergrade = console.next();
			students.add(new Student(lastname, firstname, studentid, percentgrade, lettergrade));
		}


		// students.add(new Student("Feng", "Dylan", "999999", 62, "D"));
		// students.add(new Student("Nayadu", "Arnav", "086004", 40, "F"));
		// students.add(new Student("Peng", "Austin", "103120", 71, "C"));
		// students.add(new Student("Arora", "Shreyas", "010120", 101, "A"));
		// students.add(new Student("Virus", "Corona", "122520", 150, "A"));
		// students.add(new Student("Sanders", "Bernie", "032620", 35, "F"));
		// students.add(new Student("In-Place", "Shelter", "050120", 100, "A"));

		//last name
		System.out.println("Student data, by last name:");
		Collections.sort(students, new lName());
		for(int i = 0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		System.out.println();
		//first name
		System.out.println("Student data, by first name:");
		Collections.sort(students, new fName());
		for(int i = 0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		System.out.println();
		//student ID
		System.out.println("Student data, by student id:");
		Collections.sort(students, new sID());
		for(int i = 0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		System.out.println();
		//percent
		System.out.println("Student data, by percentage:");
		Collections.sort(students, new perc());
		for(int i = 0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		System.out.println();
		//grade
		System.out.println("Student data, by grade:");
		Collections.sort(students, new grcomp());
		for(int i = 0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		System.out.println();
		//last name reverse
		System.out.println("Student data, by last name(reversed):");
		Collections.sort(students, new lNamerev());
		for(int i = 0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		System.out.println();
		//first name reverse
		System.out.println("Student data, by first name(reversed):");
		Collections.sort(students, new fNamerev());
		for(int i = 0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		System.out.println();
		//Student id  reverse
		System.out.println("Student data, by student id(reversed):");
		Collections.sort(students, new sIDrev());
		for(int i = 0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		System.out.println();
		//percentage reverse
		System.out.println("Student data, by percentage(reversed):");
		Collections.sort(students, new percrev());
		for(int i = 0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		System.out.println();
		//grade reverse
		System.out.println("Student data, by grade(reversed):");
		Collections.sort(students, new grcomprev());
		for(int i = 0;i<students.size();i++){
			System.out.println(students.get(i));
		}
		System.out.println();
	}

}







class Student{
	String lastName;
	String firstName;
	String studentID;
	float percent;
	String grade;

	public Student(String lastName,
					String firstName,
					String studentID,
					float percent,
					String grade){
		this.lastName = lastName;
		this.firstName = firstName;
		this.studentID = studentID;
		this.percent = percent;
		this.grade = grade;
	}
	public String toString(){
		String ret = padRight(this.lastName, 10)+padRight(this.firstName, 14)+this.studentID+padLeft(Float.toString(this.percent), 8)+"     "+this.grade;
		return ret;
	}

	public String padRight(String s, int n) {
    	return String.format("%-" + n + "s", s);
	}
	public String padLeft(String s, int n) {
    	return String.format("%" + n + "s", s);
	}
}






class lName implements Comparator<Student>{
	public int compare(Student a, Student b){
		return a.lastName.compareTo(b.lastName);
	}
}
class lNamerev implements Comparator<Student>{
	public int compare(Student a, Student b){
		return (a.lastName.compareTo(b.lastName))*-1;
	}
}
class fName implements Comparator<Student>{
	public int compare(Student a, Student b){
		return a.firstName.compareTo(b.firstName);
	}
}
class fNamerev implements Comparator<Student>{
	public int compare(Student a, Student b){
		return -1*(a.firstName.compareTo(b.firstName));
	}
}

class sID implements Comparator<Student>{
	public int compare(Student a, Student b){
		return Integer.parseInt(a.studentID) - Integer.parseInt(b.studentID);
	}
}
class sIDrev implements Comparator<Student>{
	public int compare(Student a, Student b){
		return -1*(Integer.parseInt(a.studentID) - Integer.parseInt(b.studentID));
	}
}
class perc implements Comparator<Student>{
	public int compare(Student a, Student b){
		if(a.percent == b.percent){
			return 0;
		}
		else if(a.percent > b.percent){
			return 1;
		}
		else{
			return -1;
		}
	}
}
class percrev implements Comparator<Student>{
	public int compare(Student a, Student b){
		if(a.percent == b.percent){
			return 0;
		}
		else if(a.percent > b.percent){
			return -1;
		}
		else{
			return 1;
		}
	}
}
class grcomp implements Comparator<Student>{
	public int compare(Student a, Student b){
		return a.grade.compareTo(b.grade);
	}
}
class grcomprev implements Comparator<Student>{
	public int compare(Student a, Student b){
		return -1*(a.grade.compareTo(b.grade));
	}
}
