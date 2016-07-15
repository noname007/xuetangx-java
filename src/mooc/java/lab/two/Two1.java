package mooc.java.lab.two;

import java.util.Scanner;

public class Two1 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		MyPoint p1 = new MyPoint(in.nextDouble(),in.nextDouble()) ;
		MyPoint p2 = new MyPoint(in.nextDouble(),in.nextDouble()) ;
		
		System.out.println(p2.getD(p1));
		in.close();
	}
}


class MyPoint
{
	private double x,y;
	
	MyPoint()
	{
		x = y = 0;
	}
	
	MyPoint(double x,double y)
	{
		this.x = x;
		this.y = y;
	}
	
	double getD(MyPoint o)
	{
		return Math.sqrt( Math.pow(o.x-this.x, 2) + Math.pow(o.y-this.y,2) );
	}
}