package mooc.java.lab.two;

import java.util.Scanner;

/**
 * 编写一个三角形类，能根据输入的3个double类型数据构造三角形对象，定义三个构造方法。
 * 
如果这3个数据满足构成三角形的条件，直接构造三角形。
否则，如果3个数的最大值大于0，则自动构造以最大值为边的等边三角形。
如果最大值也不大于0，则将三角形类的三边都初始化为0。

再定义一个getArea方法，计算所构造的三角形的面积，返回类型为double。
最后，编写main方法，测试getArea方法，计算三角形的面积。
 * @author yangzhenzhen
 *
 */
public class Two2 {
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		double[] n = new double[3];
		n[0] = in.nextDouble();
		n[1] = in.nextDouble();
		n[2]= in.nextDouble();
		
		double tmp;
		
		for(int i = 0; i<3;++i)
		{
			for(int j = i + 1; j < 3; ++j)
			{
				if(n[i] > n[j])
				{
					tmp = n[i];
					n[i] = n[j];
					n[j] = tmp;
				}
			}
		}
		
		Triangle tri;
		
		boolean could_bulid_triangle = (n[0] + n[1] > n[2]) && (n[0] + n[2] > n[1]) && (n[1] + n[2] > n[0]);
		
		if(could_bulid_triangle)
		{
			tri = new Triangle(n[0],n[1],n[2]);
		}else{
			
			if(n[2] > 0 )
			{
				tri = new Triangle(n[2]);
			}else{
				tri = new Triangle();
			}
		}
		
		System.out.println(tri.getArea());
		
		in.close();
	}

}

class Triangle
{
	private double edge1,edge2,edge3;
	
	Triangle()
	{
		edge1 = edge2 = edge3 = 0;
	}
	Triangle(double e1,double e2,double e3)
	{
		edge1 = e1;
		edge2 = e2;
		edge3 = e3;
	}
	Triangle(double e)
	{
		edge1 = edge2 = edge3 = e;
	}

	double getArea()
	{
		double p = (edge1 + edge2 + edge3) / 2;
		return Math.sqrt(p * (p - edge1) * (p - edge2) * (p - edge3));
	}
}
