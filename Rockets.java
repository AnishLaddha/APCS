public class Rockets
{
	public static void triangle(){
		System.out.println("   /\\   " + " " + "   /\\   ");
		System.out.println("  /  \\  " + " " + "  /  \\  ");
		System.out.println(" /    \\ " + " " + " /    \\ ");
	}
	public static void square(){
		System.out.println("+------+" + " " + "+------+");
		System.out.println("|      |" + " " + "|      |");
		System.out.println("|      |" + " " + "|      |");
		System.out.println("+------+" + " " + "+------+");
	}
	public static void us(){
		System.out.println("|United|" + " " + "|United|");
		System.out.println("|States|" + " " + "|States|");
	}
	public static void main(String[] args)
	{
		triangle();
		square();
		us();
		square();
		triangle();
	}
}