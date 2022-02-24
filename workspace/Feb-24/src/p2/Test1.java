package p2;

public class Test1 {
	
	public static void main(String[] args) {
		
		double x =10.5; //ok
		System.out.println(x);
		
		int i = (int) x; // Error -> narrowing
		System.out.println(i);
	}

}
