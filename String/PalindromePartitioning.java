package String;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "aabbcdea";
		partition(str);
		System.out.println(partition(str));
	}

    static List<List<String>> partition(String str) {
       
    	List<String> list1 = new ArrayList<String>();
    	List<List<String>> list = new ArrayList<List<String>>();
		for(int i=0; i<str.length(); i++) 
		{
			list1.add(Character.toString(str.charAt(i)));
			if(i == str.length()-1 ) 
			{
				list.add(list1);
			}
		}
		
		for(int j=0; j<str.length(); j++) 
		{
			int start = 0;
			int end = str.length()-1-j;
			if(str.charAt(start) == str.charAt(end))
			{
				start = start+1;
				end= end -1;
			}else 
			{
				end = end -1;
			}
		}
		
		
		return list;
    }
}
