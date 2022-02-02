package Sorting;

import java.util.Arrays;

public class FirstMissingPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {7,8,9,11,12};
		firstMissingPositive(arr);
		System.out.println(Arrays.toString(arr));
	}
		
	static int firstMissingPositive(int[] arr) {
		
		
		int i=0;
		
		while(i<arr.length)
		{
			while(i<arr.length)
			{
			
					int correct = arr[i]-1;
					if(arr[i]>0 && arr[i]<=arr.length && arr[i] !=  arr[correct]) 
					{
						int temp = arr[i];
						arr[i] = arr[correct];
						arr[correct] = temp;
					}
					else 
					{
						i++;
					}
				
			}	
		}
		
		for (int j = 0; j < arr.length; j++) {
			if(arr[j] != j+1 ) 
			{
				return j+1;
			}
		}
		return arr.length+1;
	
	}
}
