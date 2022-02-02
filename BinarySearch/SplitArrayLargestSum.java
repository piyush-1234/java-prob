package BinarySearch;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {7,2,5,10,8};
		int m = 2;
		int ans = split(arr, m);
		System.out.println(ans);
	}
	
	static int split(int[] arr, int m) 
	{
		int start = 0;
		int end = 0;
		
		for (int i = 0; i < arr.length; i++) {
			start = Math.max(start, arr[i]);
			end += arr[i];
		}
		
		while(start<end)
		{
			
			int mid = start +(end-start)/2;
			int sum =0;
			int pieces = 1;
			for(int element : arr) 
			{
				if(sum+element > mid) 
				{
					sum = element;
					pieces++;
				}else 
				{
					sum +=element;
				}
			}
			if(pieces>m) 
			{
				start = mid +1;
			}else 
			{
				end = mid;
			}
			}
		
		
		return end;
		
		}
	}

