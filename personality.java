import java.util.*;
import java.io.*;
import java.lang.Math;
public class personality{
	public static final int dimensions = 4;
	public static void main(String[] args) throws FileNotFoundException{
		Scanner input = new Scanner(System.in);
		System.out.print("Input file name: ");
		String s = input.next();
		Scanner console = new Scanner(new File(s));
		String[] values = fileinput(console);
		String[] names = name(values);
		String[] results = result(values);
		for(int i = 0; i < 9;i++){
			String name = names[i];
			String testRes = results[i];
			resultCalc(name, testRes);
			System.out.println("");
		}
	}
	public static void resultCalc(String name, String results){
		results = results.toUpperCase();
		int[] acount = new int[dimensions];
		int[] bcount = new int[dimensions];
		for(int i = 0; i < 4; i++){
			acount[i] = 0;
			bcount[i] = 0;
		}
		for(int i = 0; i <70; i+=7){
			if(results.charAt(i) == 'A'){
				acount[0] +=1;
			}else if(results.charAt(i) == 'B'){
				bcount[0]+=1;
			}if(results.charAt(i+1) == 'A'){
				acount[1] +=1;
			}else if(results.charAt(i+1) == 'B'){
				bcount[1]+=1;
			}if(results.charAt(i+2) == 'A'){
				acount[1] +=1;
			}else if(results.charAt(i+2) == 'B'){
				bcount[1]+=1;
			}if(results.charAt(i+3) == 'A'){
				acount[2] +=1;
			}else if(results.charAt(i+3) == 'B'){
				bcount[2]+=1;
			}if(results.charAt(i+4) == 'A'){
				acount[2] +=1;
			}else if(results.charAt(i+4) == 'B'){
				bcount[2]+=1;
			}if(results.charAt(i+5) == 'A'){
				acount[3] +=1;
			}else if(results.charAt(i+5) == 'B'){
				bcount[3]+=1;
			}if(results.charAt(i+6) == 'A'){
				acount[3] +=1;
			}else if(results.charAt(i+6) == 'B'){
				bcount[3]+=1;
			}
		}
		int[] bpercent = new int[dimensions];
		for(int i = 0; i <4; i++){
			bpercent[i] = (int)(Math.round(((double)bcount[i]/(double)(acount[i]+bcount[i])) * 100));
		}
		String type = "";
		if(bpercent[0] > 50){
			type = type + "I";
		}else if(bpercent[0] == 50){
			type = type + "X";
		}else{
			type = type + "E";
		}if(bpercent[1] > 50){
			type = type + "N";
		}else if(bpercent[1] == 50){
			type = type + "X";
		}else{
			type = type + "S";
		}if(bpercent[2] > 50){
			type = type + "F";
		}else if(bpercent[2] == 50){
			type = type + "X";
		}else{
			type = type + "T";
		}if(bpercent[3] > 50){
			type = type + "P";
		}else if(bpercent[3] == 50){
			type = type + "X";
		}else{
			type = type + "J";
		}
		System.out.println(name+":");
		System.out.print("    ");
		System.out.print(acount[0]+"A-"+bcount[0]+"B "+acount[1]+"A-"+bcount[1]+"B "+acount[2]+"A-"+bcount[2]+"B "+acount[3]+"A-"+bcount[3]+"B");
		System.out.print("    ");
		System.out.print("["+bpercent[0]+"%, " + bpercent[1] + "%, "+ bpercent[2] + "%, " +bpercent[3]+"%]");
		System.out.println(" = "+type);
	} 
	public static String[] fileinput(Scanner c){
		String[] vals = new String[19];
		int i = 0;
		while(c.hasNextLine()){
			String hold = c.nextLine();
			vals[i] = hold;
			i++;
		}
		return vals;
	}
	public static String[] name(String[] whole){
		String[] names = new String[9];
		for(int i = 0; i < 18; i+=2){
			names[i/2] = whole[i];
		}
		return names;
	}
	public static String[] result(String[] whole){
		String[] results = new String[9];
		for(int i =1; i<18; i+=2){
			results[i/2] = whole[i];
		}
		return results;
	}
}