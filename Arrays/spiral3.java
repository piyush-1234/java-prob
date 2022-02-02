/**
 * spiral3
 */
public class spiral3 {

    public static void main(String[] args) {
         int n=3;
         generateMatrix(n);
    }

    static int[][] generateMatrix(int n) {
        int[][] A = new int[n][n];
        
       
        int T,B,L,R,dir;
        T=0;
        B=A.length-1;
        L=0;
        R=A[0].length-1;
        dir=0;
        int i;
        int k=1;
        
        while(T<=B && L<=R)
        {
            if(dir==0)
            {
                for(i=L;i<=R;i++)
                 {
                    A[T][i] = k;
                    k++;
                 }  
                T++;
            }
            else if(dir==1)
            {
                for(i=T;i<=B;i++)
                  {   A[i][R]=k;
                     k++;
                  }
                R--;
            }
            else if(dir==2)
            {
                for(i=R;i>=L;i--)
                 {     A[B][i]=k;
                      k++;
                 }
                B--;
            }
            else if(dir==3)
            {
                for(i=B;i>=T;i--)
                 {     A[i][L]=k;
                      k++;
                 }
                L++;
            }
            dir=(dir+1)%4;
        }
         for (int j = 0; j < A.length; j++) {
             for(int j1 = 0; j1 < A.length; j1++)
             {
                System.out.print(A[j][j1]+" ");
             }
            System.out.println();
         }
        return A;
    }
}