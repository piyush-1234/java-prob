package LinearSearch;

public class Richest_Customer_Wealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] accounts = {
				 {1,2,3},{3,2,7}
		};
		maximumWealth(accounts);
	}
	static int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] row : accounts)
        {
        	int elements=0;
            for(int element : row)
            {
                elements += element; 
            }
            if(elements > max)
            {
                max=elements;
            }
        }
        System.out.println(max);
        return max;
    }
}
