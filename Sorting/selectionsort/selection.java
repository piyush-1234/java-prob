import java.util.Arrays;

/**
 * selection
 */
public class selection {

    public static void main(String[] args) {
        int[] arr = {5,3,1,4,2};
        sol(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sol(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
             int lastIndex = arr.length - i - 1;
             int maxIndex = maxIndex(arr, 0, lastIndex);   
             swap(arr, maxIndex, lastIndex);
        }
    }

    static int maxIndex(int[] arr, int first, int last)
    {
         int max = first;
         for (int i = first; i <= last; i++) {
             if(arr[max] < arr[i])
             {
                max = i;
             }
         }
         return max; 
    }

    static void swap(int[] arr, int maxIndex, int lastIndex)
    {
          int temp = arr[maxIndex];
          arr[maxIndex] = arr[lastIndex];
          arr[lastIndex] = temp;
    }
}