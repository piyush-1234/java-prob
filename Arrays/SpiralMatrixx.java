import java.util.ArrayList;
import java.util.List;

public class SpiralMatrixx {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        spiralOrder(arr);
        
    }
    static List<Integer> spiralOrder(int[][] A) {
        
        List<Integer> list = new  ArrayList<>();
    
        int T,B,L,R,dir;
        T=0;
        B=A.length-1;
        L=0;
        R=A[0].length-1;
        dir=0;
        int i;
        
        
        while(T<=B && L<=R)
        {
            if(dir==0)
            {
                for(i=L;i<=R;i++)
                    list.add(A[T][i]);
                T++;
            }
            else if(dir==1)
            {
                for(i=T;i<=B;i++)
                     list.add(A[i][R]);
                R--;
            }
            else if(dir==2)
            {
                for(i=R;i>=L;i--)
                      list.add(A[B][i]);
                B--;
            }
            else if(dir==3)
            {
                for(i=B;i>=T;i--)
                     list.add(A[i][L]);
                L++;
            }
            dir=(dir+1)%4;
        }

        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
        return list;
    }
}
