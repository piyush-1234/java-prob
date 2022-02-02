import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        
        int[] arr = {3,0,1};
        findNumber(arr);
        System.out.println(findNumber(arr));
    }

    static int findNumber(int[] arr)
    {
          int i=0;
          int k=0;
          while(i<arr.length)
         {
             if(arr[i] == 0)
             {
                k=i+1;
                i++;
             }
             int correct = arr[i]-1;
             if(arr[i] != arr[correct])
             {
                 swap(arr, i, correct);
             }else
             {
                 i++;
             }
         }
         return k;
         
    }

    static void swap(int[] arr, int i, int correct)
    {
           int temp = arr[i];
           arr[i] = arr[correct];
           arr[correct] = temp;
    }
}
