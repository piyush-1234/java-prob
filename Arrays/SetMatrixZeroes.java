import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SetMatrixZeroes {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{1,0,1},{1,1,1}};

        setZeroes(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void setZeroes(int[][] arr)
     {
         List<Integer> list = new ArrayList<>();
       for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j < arr[0].length; j++) {
           
            if(arr[i][j] == 0)
            {
               list.add(i);
               list.add(j);
            }
           }
        }

        int x=0;
        int y=1;
        while(x<list.size() && y<list.size())
        {
            int r=list.get(x);
            int c=list.get(y);
            while(r<arr.length)
            {
                arr[r++][c] = 0;
            }
            r=list.get(x);

            while(r<arr.length && r>=0)
            {
                arr[r--][c] = 0;
            }
            r=list.get(x);
            
            while(c<arr[0].length)
            {
                arr[r][c++] = 0;
            }
            c=list.get(y);

            while(c<arr[0].length && c>=0)
            {
                arr[r][c--] = 0;
            }
            c=list.get(y);

            x=x+2;
            y=y+2;
        }
        
    }       
}    