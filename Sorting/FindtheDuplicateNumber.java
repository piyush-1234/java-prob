package Sorting;

import java.util.Arrays;

public class FindtheDuplicateNumber {
          public static void main(String[] args) {
	     int[] arr = {3,1,3,4,2};
	     System.out.println((findDuplicate(arr)));
      }
    
      static int findDuplicate(int[] arr) {
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
  		
  		for(int j=0; j<arr.length; j++) 
  		{
  			if(arr[j] != j+1 ) 
  			{
  				k=arr[j];
  			}
  		}
		return k;
   }
     
}
