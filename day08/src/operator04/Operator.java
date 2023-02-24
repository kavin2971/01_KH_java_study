package operator04;

public class Operator {
	
	int num1 = 1;
	int num2 = 2;
	
	int add() {
		return num1 + num2;
	}
	
	int add(int num1) {
		return num1+num2;
	}
	
	int add(int num1, int num2) {
		return num1+num2;
	}
	
	double add(double num1) {
		return num1+num2;
	}
	double add(double num1, double num2) {
		return num1+num2;
	}
	int subtract (int num1) {
		return num1-num2;
	}
	int subtract (int num1, int num2) {
		return num1-num2;
	}
	int multiplt(int num1) {
		return num1*num2;
	}
	int multiply (int num1, int num2) {
		return num1*num2;
	}
	double divide (double num1) {
		return num1/num2;
	}
	double divide(double num1, double num2) {
		return num1/num2;
	}
	int add(int[] arrInt) {
		int sum = 0;
		for (int i=0; i<arrInt.length; i++) {
			sum += arrInt[i];
	    }
		return sum;
	}
	
}
