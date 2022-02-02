public class FindtheHighestAltitude {
    public static void main(String[] args) {
        int[] arr = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
        largestAltitude(arr);
    }

    static int largestAltitude(int[] arr) {
        int[] str = new int[arr.length+1];
        int ele =0;
        int k=0;
        for(int i=0; i<=arr.length; i++)
        {
            if(i>0 )
            {
                if(k==0)
                {
                    str[i] = arr[k]+0;
                    k++;
                }else
                {
                    str[i] = str[k]+arr[i-1];
                    k++;
                }
                
            }else
            {
                 str[i] = 0;
                
            }
           
        }
         int mx =0;
        for(int j=0; j<str.length; j++)
        {
            System.out.println(str[j]);
           
            if(mx<str[j])
            {
                mx=str[j];
            }
        }
        
        return mx;
    }
}
