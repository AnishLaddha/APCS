import java.util.*;
public class Point{
	int x;
	int y;
	public Point(int initialx, int initialy){
		x = initialx;
		y = initialy;

	}

	public Point(){
		x = 0;
		y = 0;
	}

	public void translate(int dx, int dy){
		x += dx;
		y += dy;
	}
	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public void setXY(int setX, int setY){
		x = setX;
		y = setY;
	}

	public String toString(){
		return ("("+x+","+" "+y+")");
	}

	public int getQuadrant(){
		if(x ==0 || y == 0){
			return 0;
		}else if(x > 0 && y > 0){
			return 1;
		}
		else if(x<0 && y > 0){
			return 2;
		}
		else if(x < 0 && y < 0){
			return 3;
		}
		else if(x >0 && y <0){
			return 4;
		}
		else{
			return -1;
		}
	}

	public double distanceToOrigin(){
		double xval = (double) x;
		double yval = (double) y;
		return Math.sqrt((xval*xval)+(yval*yval));
	}
	public double slope(Point usr){
		double deltx = (double)(x-usr.getX());
		double delty = (double)(y-usr.getY());
		return delty/deltx;
	}


}