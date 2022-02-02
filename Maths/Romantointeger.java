import java.util.*;


public class Romantointeger {
	static int romanToInt(String s) {

            HashMap<Character, Integer> ma = new HashMap<>();
            ma.put('I', 1);
            ma.put('V', 5);
            ma.put('X', 10);
            ma.put('L', 50);
            ma.put('C', 100);
            ma.put('D', 500);
            ma.put('M', 1000);
           int result = ma.get(s.charAt(s.length()-1));
            for (int i = s.length()-2; i >=0; i--) {
				if (ma.get(s.charAt(i))<ma.get(s.charAt(i+1))) {
					result -=ma.get(s.charAt(i));
				}else {
					result +=ma.get(s.charAt(i));
				}
			}
            System.out.println(result);
		return result;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		romanToInt(s);
	}
}
