package mooc.java.lab.two;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Rectangle rect = new Rectangle(in.nextInt(),in.nextInt());
		System.out.printf("%d %d",rect.getArea(),rect.getPerimeter());
		in.close();
	}

	
//	System.out.printf("%d %d",rect.getArea(),rect.getPerimeter());
}


class Rectangle{
	private long height;
	private long width;
	

	public  Rectangle(long h,long w)
	{
		this.height = h;
		this.width = w;
	}
	
	public long getArea()
	{
		return this.height * this.width;
	}
	
	public long getPerimeter()
	{
		return 2*(this.width + this.height);
	}
}
