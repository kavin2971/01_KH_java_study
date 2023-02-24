package staticVari02;

public class ProductTest {

	public static void main(String[] args) {
		
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		
		System.out.println("p1의 제품번호 : No."+p1.proNo);
		System.out.println("p2의 제품번호 : No."+p2.proNo);
		System.out.println("p3의 제품번호 : No."+p3.proNo);
		System.out.println("p4의 제품번호 : No."+p4.proNo);
		System.out.println("p5의 제품번호 : No."+p5.proNo);
		
		System.out.println("총 생산된 제품의 수 : "+Product.count+"개");

	}

}
