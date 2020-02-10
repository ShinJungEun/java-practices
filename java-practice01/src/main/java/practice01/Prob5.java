package practice01;

public class Prob5 {

	public static void main(String[] args) {
//		int n = 360;
//		String s = String.valueOf(n);
//		System.out.println(s.charAt(0) == '3');
		
		String s = "";
		for( int i = 1; i <=100; i++ ) {
			s = String.valueOf(i);
			if(i < 10) {
				if(s.charAt(0) == '3' || s.charAt(0) == '6' || s.charAt(0) == '9')
					System.out.println(s + "짝");
			}
			else {
				if(s.charAt(0) == '3' || s.charAt(0) == '6' || s.charAt(0) == '9') {
					if(s.charAt(1) == '3' || s.charAt(1) == '6' || s.charAt(1) == '9') {
						System.out.println(s + "짝짝");
					}
					else {
						System.out.println(s + "짝");
					}
				}
				else if(s.charAt(1) == '3' || s.charAt(1) == '6' || s.charAt(1) == '9') {
					System.out.println(s + "짝");
				}
			}

			
		}
	}
}
