package Sorting;

import java.util.Arrays;

public class SetMismatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int[] arr = {1,2,2,4};
            
            System.out.println(Arrays.toString(findErrorNums(arr)));
	}

	 static int[] findErrorNums(int[] arr) {
	        
	        int i=0;
	        int k=0;
	        while(i<arr.length)
	        {
	            int correct = arr[i]-1;
	            if(arr[i] != arr[correct])
	            {
	                int temp = arr[i];
	                arr[i] = arr[correct];
	                arr[correct] = temp;
	            }else
	            {
	                i++;
	            }
	        }
	        
	        int[] brr = new int[2];
	        for(int j=0; j<arr.length; j++)
	        {
	            if(arr[j] != j+1)
	            {
	                brr[0] = arr[j];
	                brr[1] = j+1;
	            }
	        }
			return brr;
	    }
}
