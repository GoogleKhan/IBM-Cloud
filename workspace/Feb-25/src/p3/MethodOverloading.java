package p3;

public class MethodOverloading {

	int sum(float a, int b) {
		return (int) (a + b);
	}
	
	int sum(int a, float b) {
		return (int) (a + b) ;
	}

	int sum(int a, int b, int c) {
		return a + b + c;
	}

}
