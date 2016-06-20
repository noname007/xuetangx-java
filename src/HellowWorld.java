import java.util.Arrays;

public class HellowWorld {

	public static void main(String [] args) {
		//数组的声明、创建、初始化
		int a1[] ={1,2,3,4,5};
		System.out.println(Arrays.toString(a1));
		
		// 声明
		int [] b1;
		// 创建＋默认初始化
		b1 = new int[5];
		
		// 自己初始化
		for(int i = 0; i <b1.length; ++i){
			b1[i] = i;
		}
		System.out.println(Arrays.toString(b1));
		
		//
		//int a[4] ={1,2,3,4}; //---error syntax
		//int a[] = new p[10]; //---error syntax
		
		int a[][] = new int[3][];
		System.out.println(Arrays.deepToString(a));

		
//		System.out.println(Arrays.toString(args));
		//String str[]  = "11111";
//		int [] ai;
//		ai = new int[100];
		
		
		boolean True = true;
		
		System.out.println(True);
		int i = 1;
		//System.out.println( ( ((1| 10)) & 9 >10 ?10:9));
		
		
		
//		
//		int a11[] = new int[10];
//		boolean [] a12 = new boolean[10];
//		
//		System.out.println(Arrays.toString(ai));
		//System.out.println(str);
	}
}
