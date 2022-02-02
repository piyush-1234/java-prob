package BinarySearch;

import java.util.Arrays;

public class FirstAndLastPositionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {2,3,4,5,5,5,5,5,5,12,12,12,12,23,34,45,54,54,54};
		int target = 5;
		int[] as = searchRange(arr, target);
		System.out.println(Arrays.toString(as));
	}
	 static int[] searchRange(int[] arr, int target) {
	      
		 int[] ans = {-1,-1};
		 int start = search(arr,target,true);
		 int end = search(arr,target,false);
		 ans[0] = start;
		 ans[1] = end;
		 
		 return ans;
	    }
	 
	 static int search(int[] arr, int target, boolean findStartIndex)
	 {
		 int anss = -1;
		 int start = 0;
		 int end = arr.length-1;
		 while(start<=end)
		 {
			 int mid = start + (end- start)/2;
			 if(target<arr[mid]) 
			 {
				 end = mid -1;
			 }else if(target>arr[mid]){
				 start = mid+1;
			 }else {
				 anss = mid;
				 if(findStartIndex) 
				 {
					 end = mid-1;
				 }else {
					 start = mid+1;
				 }
			 }
		 }
		 return anss;
	 }
}
