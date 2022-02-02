import java.util.Arrays;

public class ShuffletheArray {
    
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4,7};
        int n = 3;
        shuffle(arr, n);
    }

    static int[] shuffle(int[] arr, int n) {
        int[] ans = new int[arr.length];
        
        int i=0;
        int start = 0;
        int end = arr.length/2;
       while(i<arr.length)
       {
          
           if(i%2==0)
           {
               ans[i] = arr[start];
               start++;
               i++;
           }else
           {
               ans[i] = arr[end];
               end++;
               i++;
           }
           
       }
       System.out.println(Arrays.toString(ans));
        return ans;
    }
}
