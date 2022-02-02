package BinarySearch;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,6,7,0,1,2};
		int target = 5;
		System.out.println(findInMountainArray(arr, target));

	}
	static int findInMountainArray(int[] arr, int target) {

		// finding the peak index
		int pivot = findPivot(arr);
		if(pivot == -1) 
		{
		       return binarySearch(arr,target, 0, arr.length-1);

		}
        if(arr[pivot] == target)
        {
        	return pivot;
        }
        
        if(target >= arr[0]) 
        {
        	return binarySearch(arr, target, 0, pivot-1);
        }
        
        return binarySearch(arr, target, pivot+1, arr.length-1);
	}


	static int findPivot(int[] arr) 
	{
		int start = 0;
		int end = arr.length -1;
	
		while(start <= end) 
		{
			int mid = start+(end-start)/2;
			if(mid < end && arr[mid] > arr[mid+1]) 
			{
				return mid;
			}
			if(mid > start && arr[mid]< arr[mid-1]) 
			{
				return mid-1;
			}
			if(arr[mid] <= arr[start]) 
			{
				 end = mid -1;
			}else 
			{
				start = mid + 1;
			}
		}
		return -1;
	}
	
	static int findPivotDuplicate(int[] arr) 
	{
		int start = 0;
		int end = arr.length-1;
		while(start<=end) 
		{
			int mid = start + (end-start)/2;
			if(mid < end && arr[mid] > arr[mid+1]) 
			{
				return mid;
			}
			if(mid > start && arr[mid] < arr[mid-1]) 
			{
				return mid-1;
			}
			
			if(arr[start] == arr[mid] && arr[end] == arr[mid]) 
			{
				if(arr[start] > arr[start+1]) 
				{
					return start;
				}else
				{
					start++;
				}
				
				if(arr[end] < arr[end-1]) 
				{
					return end-1;
				}else 
				{
					end--;
				}
				
			}else if(arr[start]< arr[mid] || arr[start] == arr[mid] && arr[mid]>arr[end]) 
			{
				start = mid +1;
			}else {
				end = mid -1;
			}
		}
		return -1;
	}
	
	static int binarySearch(int[] arr,int target, int newStart, int newEnd) 
	{
		while(newStart <= newEnd ) 
		{
			int mid = newStart+(newEnd-newStart)/2;
			
			if(target < arr[mid]) {
				newEnd = mid-1;
			}else if(target > arr[mid])
			{
				newStart = mid+1;
			}else
			{
				return mid;
			}
		}
		return -1;
	}
	
}
