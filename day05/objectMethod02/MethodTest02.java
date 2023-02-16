package objectMethod02;
class Arithmetic {
	int add(int x, int y) {
		int result = x + y;
		return result;
	}
	int subtract(int x, int y) {
		return x-y;
	}
	int multiply(int x, int y) {
		return x*y;
	}
	double divide(double x, double y) {
		return x/y;
	}
}

public class MethodTest02 {
	public static void main(String[] args) {
		Arithmetic am1 = new Arithmetic();
		
		int result = am1.add(7, 8);
		System.out.println(result);
		
		result = am1.multiply(6, 2);
		System.out.println(result);

		result = am1.multiply(2930, 3829);
		System.out.println(result);
		
		double result2 = am1.divide(9, 6);
		System.out.println(result2);
	}

}
