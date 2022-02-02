package Sorting;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,0,1};
		int ans = missingNumber(arr);
		System.out.println(ans);
	}

	static int missingNumber(int[] arr) {
		 int i=0;
		 int k=0;
		 while(i<arr.length)
		 {
			 if(arr[i] == 0) 
			 {
				 k=i+1;
				 i++;
			 }else {
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
				
		}
		 
			 return k;
		 
		 
   }
	
}

