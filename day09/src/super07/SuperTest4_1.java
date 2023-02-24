package super07;



		class Parent4 {
			int parenNum;
			Parent4(int x){
				this.parenNum = x*x;
				System.out.println(" x제곱 : " + this.parenNum);
			}
		}
		class Child4 extends Parent4{
			int childNum;
			Child4(int x, int y) {
				super(x);
				this.childNum = y*y;
				System.out.println(" y제곱 : " + this.childNum);
			}
		}
		public class SuperTest4_1 {
		public static void main(String[] args) {
		Child4 ch4 = new Child4(3,7);
//		System.out.println("x변수의 제곱 = "+ch4.parenNum);
//		System.out.println("x변수의 제곱 = "+ch4.childNum);
	
	}

}
