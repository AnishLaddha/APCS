public class test{
	public static void main(String[] args) {
		double[] a = HSL_RGB(0,1,0.5);
		double[] b = HSL_RGB(127,1,0.5);

		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
		for(int i = 0; i < a.length; i++){
			System.out.println(b[i]);
		}
		
	}
	public static double[] HSL_RGB(double hue, double sat, double lum){
		double c = (1-Math.abs((2*lum) - 1)) * sat;
		double h = hue/60;
		double x = c * (1-Math.abs((h%2)-1));
		if (0 <= h & h <= 1){
			double[] a = {c*255,x*255,0};
			return a;

		}
		else if (1 < h & h <= 2){
			double[] a = {x*255,c*255,0};
			return a;
		}
		else if (2 < h & h <= 3){
			double[] a = {0,c*255,x*255};
			return a;
		}
		else if (3 < h & h <= 4){
			double[] a = {0,x*255,c*255};
			return a;
		}
		else if (4 < h & h <= 5){
			double[] a = {x*255,0,c*255};
			return a;
		}
		else if (5 < h & h <= 6){
			double[] a = {c*255,0,x*255};
			return a;
		}
		else{
			double[] a = {0,0,0};
			return a;
		}

	}
}