package p3;

public class CalculateSalary {

	public static void main(String[] args) throws MyException {
		double totalSalary = calcSalary(-100);
		System.out.println(totalSalary);
	}

	private static double calcSalary(int basic) throws MyException {
//		
//		if(basic <=0) {
//			System.out.println("Bro, Basic salary cannot zero or less than zero");
//			return 0;
//		}
		

		if(basic <=0) {
			
			MyException exp = new MyException("Bro, Basic salary cannot zero or less than zero");		
			throw exp;
		}

		double total = 2 * basic + 50;

		return total;
	}

}
