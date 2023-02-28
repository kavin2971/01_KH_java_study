package userException02;

public class Account {
	
	private int balance;

	public int getBalance() {
		return balance;
	}
	public void deposit(int money) {
		balance += money;
		System.out.println("입금액 " + money + "원이 입금되었습니다");
	}
	
	public void withdraw(int money) throws NotSufficientException {
		
		if(balance < money) {
			throw new NotSufficientException("잔고 : " + (money-balance) + "원 부족합니다");
		}
		balance -= money;
	}
	
	/*
	public void withdraw(int money) {
		if(balance < money) {
			System.out.println("잔고 : " + (money-balance) + "원 부족");
			return;
		}
		balance -= money;
	}
	*/
	

}
