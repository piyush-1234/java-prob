import java.util.Arrays;

/**
 * RunningSumof1dArray
 */
public class RunningSumof1dArray {

    public static void main(String[] args) {
        int[] arr = {1,2,1};
        solution(arr);
       
        
    }

     static int[] solution(int[] arr)
      {
        int[] ans = new int[arr.length];
        
        for(int i=0; i<arr.length; i++)
        {
            if(i>0)
            {
                 ans[i] = arr[i]+ans[i-1];
            }else
            {
                ans[i] = arr[i];
            }
           
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}