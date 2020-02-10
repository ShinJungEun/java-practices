package prob01;

public class Printer{

	public void println(int n) {
		System.out.println(n);
	}
	
	public void println(boolean check) {
		System.out.println(check);
	}
	
	public void println(double d) {
		System.out.println(d);
	}
	
	public void println(String str) {
		System.out.println(str);
	}

	public void println(int i, int j, int k, int l, int m, String string, StringBuffer stringBuffer) {
		System.out.println(i + ":" + j + ":" + k + ":" + l + ":" + m
				+ ":" + string + ":" + stringBuffer);
		
	}
	
}
