package prob6;

public class Sub {
	private int a;
	private int b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return (this.a - this.b);
	}
}
