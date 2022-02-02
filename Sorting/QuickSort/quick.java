import java.util.Arrays;
/**
 * quick
 */
public class quick {

    public static void main(String[] args) {
        int[] arr = {5,4,3,1,2};
        quickSor(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSor(int[] arr, int low, int hi)
    {
        if(low >= hi)
        {
            return;
        }

        int s=low;
        int e=hi;
        int m=s+(e-s)/2;
        int p=arr[m];
        while(s <= e)
        {
             while(arr[s] < p)
             {
                 s++;
             }
             while(arr[e] > p)
             {
                e--;
             }
             if(s<=e)
             {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
             }
        }

        quickSor(arr, low, e);
        quickSor(arr, s, hi);
    }
}