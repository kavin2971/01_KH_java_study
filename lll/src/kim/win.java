package kim;

public class win {
	int win;
	int number;
	public win() {}
	public win(int win, int number) {
		this.win = win;
		this.number = number;
	}
	public int getwin() {
		return win;
	}
	public void setwin(int win) {
		this.win = win;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "win [추첨번호 : " + win + ", 당첨번호 : " + number + "]";
	}
	

}
