import java.util.*;

public class angdist{
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);

		System.out.println("This program computes thr spherical distance between two points, 1 and 2");
		System.out.println("");
		System.out.println("Please enter the lattitude and longitude for \n each point as a pair of integers, degrees\n followed by minutes: ");


		System.out.print("lattitude 1?: ");
		int lat1d = console.nextInt();
		int lat1m = console.nextInt();
		System.out.print("longitude 1?: ");
		int long1d = console.nextInt();
		int long1m = console.nextInt();

		System.out.println("");

		System.out.print("lattitude 2?: ");
		int lat2d = console.nextInt();
		int lat2m = console.nextInt();

		System.out.print("longitude 2?: ");
		int long2d = console.nextInt();

		int long2m = console.nextInt();

		double latt1 = coord(lat1d, lat1m);
		double latt2 = coord(lat2d,lat2m);

		double longg1 = coord(long1d, long1m);

		double longg2 = coord(long2d,long2m);
		double radDist = angDist(latt1, latt2, longg1, longg2);
		System.out.println("Angular Distance = " + radDist+ " radians");
		System.out.println("Distance "+ (6372.65*radDist)+" kilometers");
		System.out.println("Distance "+ ((6372.65*radDist)*0.621371)+" miles");



	}

	public static double coord(int deg, int min){
		double min1 = min;
		double degree = ((double)deg)+((double)(min1/60));
		return degree;
	}

	public static double angDist(double lat1, double lat2, double long1, double long2){
		double lat1r = Math.toRadians(lat1);
		double lat2r = Math.toRadians(lat2);
		double long1r = Math.toRadians(long1);
		double long2r = Math.toRadians(long2);

		double sine = (Math.sin(lat1r))*(Math.sin(lat2r));
		double cosine = (Math.cos(lat1r))*(Math.cos(lat2r)*Math.cos(long2r-long1r));

		double angD = Math.acos(sine + cosine);

		return angD;

	}


}