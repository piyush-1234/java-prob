package LinearSearch;

import java.util.Arrays;

public class Find_Numbers_with_Even_Number_of_Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = {12,345,2,6,7896,-99};
		
		System.out.println(findNumbers(nums));
		//System.out.println(digits(-323432));
	}

	static int findNumbers(int[] nums)
	{
		int count = 0;
		for(int num : nums)
		{
			if(even(num))
			{
				count++;
			}
		}
		return count;
	
	}

	
	 static boolean even(int num) {
		// TODO Auto-generated method stub
		 int ans = digits(num)%2;
		 if(ans==0)
		 {
			 return true;
		 }
		return false;
	}
	 
	 static int digits(int num)
	 {
		 if(num < 0) {
			 num = num*-1;
		 }
		 
		 return (int)(Math.log10(num))+1; 
	 }

//	 static int digits(int num) {
//		 int count=0;
//
//		 while(num>0) 
//		 {
//			 count++;
//			 num = num/10;
//		 }
//		 return count;
//	 }
	
}
