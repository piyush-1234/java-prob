import java.util.Scanner;

public class ReverseInteger {
	
	static int reverse(int x) {
		String a = Integer.toString(x);
		char[] b = new char[a.length()];
		int d = 1;
		if (a.startsWith("-")) {
			b[0] = a.charAt(0);

			for (int i = 1; i < b.length; i++) {
				b[b.length - d] = a.charAt(i);

				d++;
			}
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[j]);
			}
		} else {

			for (int k = 0; k < b.length; k++) {
				b[b.length - d] = a.charAt(k);
				d++;
			}
			for (int l = 0; l < b.length; l++) {
				System.out.print(b[l]);
			}

		}
		try {
			int number = Integer.parseInt(new String(b));
		
			return number;
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
		
	
		
		
	

	}
	
	
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		reverse(x);
	}
}
