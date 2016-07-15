import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//System.out.println("Hello World11111!");
		//lab11(args);
//		lab12(args);
//		lab13(args);
	
		mooc.java.lab.two.Main.main(args);
	}

	public static void lab11(String[] args){
		Scanner in =  new Scanner(System.in);
		int N = in.nextInt();
		ArrayList<String> s = new ArrayList<>();
		in.nextLine();
		while( N > 0){
			--N;
//			System.out.println(N);
			String t = in.nextLine();
			s.add(t);
//			System.out.println(t);
		}
		Collections.sort(s);
//		String s = in.next();
		
		for(String t:s){
			System.out.println(t);
		}
		
		//System.out.println(Arrays.toString(s));
	}
	
	
	public static void lab12(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		System.out.println(Fib(N));
	}
	
	protected static long Fib(int n) {
		if(n < 2) return 1;
		
		long[] a = new long[n+1];
		a[0] = 1;
		a[1] = 1;
		for(int i = 2; i <= n; ++i){
			a[i] = a[i-1] + a[i-2];
		}
		
		return a[n];
		
//		if(n < 2) return 1;
//		return Fib(n - 1) + Fib(n - 2);	
	}
	
	
	public static void lab13(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int arr_1_len = s.nextInt(); 
		int arr_1 []  = new int[arr_1_len];
		
		for(int i = 0; i< arr_1_len; ++i)
		{
			arr_1[i] = s.nextInt();
		}
		
		int arr_2_len = s.nextInt();

		int same_count = 0;

		for(int i = 0; i < arr_2_len; ++i)
		{

			int t = s.nextInt();
			for(int j  = 0; j < arr_1_len; ++j)
			{
				if(arr_1[j] == t)
				{
					same_count ++;
				}
			}
		}
		if(same_count != 0)
			System.out.println(same_count);
		else
			System.out.println("None");
		

		
//		
//		System.out.println(Arrays.toString(arr_1));
		
	}
}
