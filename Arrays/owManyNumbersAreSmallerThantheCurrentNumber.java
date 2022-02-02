import java.util.Arrays;

public class owManyNumbersAreSmallerThantheCurrentNumber {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        smallerNumbersThanCurrent(arr);
    }
    static int[] smallerNumbersThanCurrent(int[] arr) {
        int[] brr = new int[arr.length];
        
        for(int i=0; i<arr.length; i++)
        {
            int ele = 0;
            for(int j=0; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    ele = ele + 1;
                }
            }
            brr[i] = ele;
        }
        System.out.println(Arrays.toString(brr));
        return brr;
    }
}
