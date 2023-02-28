package userException02;

public class AccountTest {

	public static void main(String[] args) {
		
		Account account = new Account();
		account.deposit(1000000);
		System.out.println("잔액 : " + account.getBalance() + "원");
		
		try {
			account.withdraw(150000);
			System.out.println("잔액 : "+account.getBalance()+"원");
		} catch (NotSufficientException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("잔액 : "+account.getBalance()+"원");
	}

}
