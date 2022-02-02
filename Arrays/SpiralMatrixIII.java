
/**
 * SpiralMatrixIII
 */
public class SpiralMatrixIII {

    public static void main(String[] args) {
        int rows=5;
        int cols=6;
        int rStart=1;
        int cStart=4;
        spiralMatrixIII(rows,cols,rStart,cStart);
    }
    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
     int[][] matrix = new int[rows*cols][2];

     int i=0;
     matrix[i++] = new int[]{rStart,cStart};

     int d=0;
     int[] direction = {0,1,0,-1,0};

     int l=0;
     while(i<rows*cols)
     {
            if(d==0 || d==2)
            {
               l++;
            }

            for(int k=0; k<l; k++)
            {
                 rStart=rStart+direction[d];
                 cStart=cStart+direction[d+1];
                 if(rStart<rows && rStart>=0 && cStart<cols && cStart>=0)
                 {
                       matrix[i++] = new int[]{rStart,cStart};
                 }
            }
            d=(d+1)%4;
     }
return matrix;
    }
}