import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//System.out.println("Hello World11111!");
		//lab11(args);
		lab12(args);
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
	
	
	
}
