package inheritance;

class AA {
	int i, j;

	void setIJ(int x, int y) {
		i = x;
		j = y;
	}

//	int getI() {
//		return i;
//	}
}

class BB extends AA {
	int z;
	int total;
	int sum() {
		total = i + j;
		return total;
	}
	int score;
	int multiply() {
		score = i * j + z;
		return score;
	}
}


public class InheritanceTest02 {
//상속관계
	public static void main(String[] args) {

		BB b1 = new BB();
		b1.setIJ(30, 70);
		b1.z = 10;
		System.out.println(b1.sum());
		System.out.println(b1.multiply());
		
	}

}
