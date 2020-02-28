public class PointClient{
	public static void main(String[] args) {
		Point moo = new Point(3,3);
		moo.translate(2,2);
		moo.setXY(moo.getX(),0);
		moo.translate(0,19);
		moo.setXY(moo.getY(),moo.getX());
		System.out.println();
	}
}