package product03;

public class Buyer {
	int money = 1000;
	int bonusPoint;
	Product[] cart = new Product[10];
	int i;
	
	void buy(Product p) {
		if (money < p.price) {
			System.out.println("잔액이 부족합니다");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;
		System.out.println(p+"를 구입");
	}
	
	
	void summary() {
		int sum = 0;
		String itemList = "";

		for (int i=0; i<cart.length; i++) {
			if(cart[i] == null)
				break;
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		
//		for(Product i : cart) {
//		if(i == null)
//			break;
//		sum += i.price;
//		itemList += i + ", ";
//	}
		System.out.println("총 구입금액 : " + sum +"원");
		System.out.println("총 구입품목 : " + itemList);
		
		
	}


}










//void buy(Product p = new Product()) {
//= new Audio()
//= new Computer()
//= new Game()
//= new Tv()
//}