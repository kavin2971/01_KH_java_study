package langPackage03;

public class Value {
	int value;
	Value(int value) {
		this.value = value;
	}
	@Override
	public boolean equals(Object o) {
		return value == ((Value)o).value;
	/*	
		if(o instanceof Value)
			return value == ((Value)o).value;
		else 
			return false;=
		*/
	}
}
