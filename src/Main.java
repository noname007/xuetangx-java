import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		//System.out.println("Hello World11111!");
		lab11(args);
		
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
}
