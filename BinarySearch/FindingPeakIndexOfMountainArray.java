package BinarySearch;

public class FindingPeakIndexOfMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {0,2,3,4,5,3,1,0};
        System.out.println(searching(arr));
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
}
