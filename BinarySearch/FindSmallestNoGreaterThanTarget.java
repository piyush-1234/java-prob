package BinarySearch;

public class FindSmallestNoGreaterThanTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        char[] letters = {'c','f','j'};
				char target = 'u';
				System.out.println(nextGreatestLetter(letters, target));
				
	}
	
	static char nextGreatestLetter(char[] arr, char target) {
       
		int start = 0;
		int end = arr.length -1;
		while(start <= end) 
		{
			int mid = start+(end-start)/2;
			
				if(target < arr[mid])
				{
					end = mid - 1;
					}else if(target > arr[mid])
					{
						start = mid + 1;
					}
		}
		return arr[start%arr.length];
    }
}
