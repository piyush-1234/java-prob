import java.util.ArrayList;
import java.util.List;

/**
 * 0NumberofGoodPairs
 */
public class NumberofGoodPairs {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        numIdenticalPairs(arr);
    }

    static int numIdenticalPairs(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++)
        {
            int ele =0;
            for(int j=i+1; j<arr.length; j++)
            {
                
                if(arr[i] == arr[j])
                {
                 List<Integer> str  = new ArrayList<>();
                  str.add(i);
                    str.add(j);
                    list.add(str);
                }
            }
        }

        System.out.println(list.size());
        return list.size();
    }
}