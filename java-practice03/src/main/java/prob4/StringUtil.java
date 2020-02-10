package prob4;

public class StringUtil {
	public static String concatenate(String[] str) {
		String s = "";
		
		for(int i = 0; i < str.length; i++) {
			s += str[i];
		}
		
		return s;
	}
}
