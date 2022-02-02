package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedinanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {4,3,2,7,8,2,3,1};
		
		
		System.out.println(findDisappearedNumbers(arr));
//		findDisappearedNumbers(arr);
//		System.out.println(Arrays.toString(arr));
	}

	 static List<Integer> findDisappearedNumbers(int[] arr) {
	        
	        List<Integer> list = new ArrayList<>();
	        int i=0;
	        int k=0;
			while(i<arr.length)
			{
				int correct = arr[i]-1;
				if(arr[i] !=  arr[correct]) 
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
			
			for(int j=0; j< arr.length; j++) 
			{
				if(arr[j] != j+1 ) 
				{
					list.add(j+1);
				}
			}
			return list;
			
	    }
}
