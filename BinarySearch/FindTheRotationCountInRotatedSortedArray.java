package BinarySearch;

public class FindTheRotationCountInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {7,9,11,12,5};
		int ans = noOfRotation(arr);
		System.out.println(ans);
	}

	static int noOfRotation(int[] arr) 
	{
		int pivot = findPivot(arr);
		
		return pivot+1;
		
	}
	
	static int findPivot(int[] arr) 
	{
	       int start = 0;
	       int end = arr.length-1;
	       while(start<=end) 
	       {
	    	 int mid = start + (end-start)/2;
	    	 if(end>mid && arr[mid] > arr[mid+1]) 
	    	 {
	    		 return mid;
	    	 }
	    	 if(start< mid && arr[mid] < arr[mid-1]) 
	    	 {
	    		 return mid-1;
	    	 }
	    	 if(arr[mid] <= arr[start]) 
	    	 {
	    		 end = mid-1;
	    	 }
	    	 if(arr[mid] >= arr[start]) 
	    	 {
	    		 start = mid +1;
	    	 }
	    	 
	    	 
	       }
	       
	       return -1;
	}
}
