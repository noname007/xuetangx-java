package mooc.java.course;

public class exam {
	public static void main(String[] str)
	{

			int a[]=new int[5];

//			a.length = 10;

			System.out.println(a.length);
	}
}



class Base{

int m;

public Base(int m){ this.m=m+1;}
public Base(){
	
}
}

class TestDemo extends Base{

public TestDemo(){
	
}
public TestDemo(int m){

m=m+1;

}

public static void main(String args[]){

TestDemo t = new TestDemo();

System.out.println(t.m);

}
}