import java.util.Arrays;

/**
 * BuildArrayfromPermutation
 */
public class BuildArrayfromPermutation {

    public static void main(String[] args) {
        int[] arr = {0,2,1,5,3,4};
        solution(arr);
        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] arr)
    {
        int[] ans = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            
            ans[j] = arr[arr[j]];
        }
      return ans;
    }
}