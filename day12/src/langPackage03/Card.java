package langPackage03;

public class Card implements Cloneable {
	
	String kind;
	int number;
	
	Card() {
		this("SPADE", 7);
	}
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	@Override
	public String toString() {
		return "카드의종류 "+kind + ", 카드의숫자 " + number;
	}
	
	public Object clone() {
		Object obj = null;
		
		try {
			super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
}
 