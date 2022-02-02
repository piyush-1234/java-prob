import java.util.Arrays;

public class ConcatenationofArray {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        solution(arr);
        System.out.println(Arrays.toString(solution(arr)));
    }
    
    static int[] solution(int[] arr)
    {
          int[] ans = new int[2*arr.length];
          
          int k=0;
          int leng = 2*arr.length;
        
          for (int i = 0; i <leng ; i++) {
              
            ans[i] = arr[k];
            if(k==arr.length-1)
            {
              k=0;
            }else
            {
                k++;
            }
          }

          return ans;
    }
}
