package BinarySearch;

public class FindInMoutainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1,2,3,4,5,3,1};
		int target = 3;
		System.out.println(findInMountainArray(arr, target));
	}

	static int findInMountainArray(int[] arr, int target) {

		// finding the peak index
		int newEnd = searching(arr);
        int newStart = 0;
       return binarySearch(arr,target, newStart, newEnd);
	}

	static int searching(int[] arr) 
	{
		int start = 0;
		int end = arr.length -1;
	
		while(start < end) 
		{
			int mid = start+(end-start)/2;
			if(arr[mid] < arr[mid+1]) 
			{
				start = mid+1;
			}else 
			{
				end = mid;
			}
		}
		return start;
	}
	
	static int binarySearch(int[] arr,int target, int start, int newEnd) 
	{
		while(start <= newEnd ) 
		{
			int mid = start+(newEnd-start)/2;
			
			if(target < arr[mid]) {
				newEnd = mid-1;
			}else if(target > arr[mid])
			{
				start = mid+1;
			}else
			{
				return mid;
			}
		}
		return -1;
	}
}
