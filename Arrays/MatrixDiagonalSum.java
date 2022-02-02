public class MatrixDiagonalSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
              diagonalSum(arr);
    }

    static int diagonalSum(int[][] arr) {

        int sum1 =0;
       
        for(int i=0; i<arr.length; i++)
        {
            int k=arr.length-1;
            for(int j=0; j<arr.length; j++)
            {
                if(i==j )
                {
                    sum1 = sum1+arr[i][j];
                }
                
            }
            
            
        }

        int sum2 = 0;
        int k=arr.length-1;
        for(int m=0 ,n=k; m<arr.length && n>=0; m++,n--)
        {
           if(m!=n)
           {
               sum2 = sum2+arr[m][n];
              
           }
            
        }
      
        System.out.println(sum2);
        int sum = sum1+sum2;
        System.out.println(sum);
            return sum;

       
    }
}
