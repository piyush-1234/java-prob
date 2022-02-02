import java.util.Arrays;

/**
 * transpose
 */
public class transpose {

    public static void main(String[] args) {
        int[][] arr = {

            {1,2,3},
            {4,5,6}
        };

         
        trans(arr);
    }

    static int[][] trans(int[][] arr) {

        int[][] str = new int[arr[1].length][arr.length];
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr[i].length; j++)
            {
               
                int a=i,b=j;
                
             if(i!=j)
                {
                    str[j][i] = arr[i][j];
                }else
                {
                    str[i][j] = arr[i][j];
                }
            }
        }
        
        for(int k=0; k<str.length; k++)
        {
            for (int l = 0; l < str[1].length; l++) {
                System.out.print( str[k][l]+" ");
            }
           System.out.println();
        }
        return str;
    }
}