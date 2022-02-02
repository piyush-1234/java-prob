import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        spiralOrder(arr);
        
    }
     
    static List<Integer> spiralOrder(int[][] arr) {
        List<Integer> list = new  ArrayList<>();  
         int left,right,top,down,dir;    
         left=0;
         right=arr[0].length-1;
         top=0;
         down=arr.length-1;
         dir=0;
         int i=0;
      while(top<=down && left<=right)
      {
          if(dir==0)
          {
            
             for ( i = left; i <= right; i++) {
                 list.add(arr[top][i]);
                
             }

             top++;
          }
          else if(dir==1)
          {
            
             for ( i = top; i <= down; i++) {
                 list.add(arr[i][right]);
               
             }
             right--;
          }
          else if(dir==2)
          {
            
             for ( i = right; i >= left; i--) {
                 list.add(arr[down][i]);
                
             }

             down--;
          }
          else if(dir==3)
          {
           
             for ( i = down; i >= top; i--) {
                 list.add(arr[i][left]);
                
             }

             left++;
          }

          dir=(dir+1)%4;

      }

    for ( i = 0; i < list.size(); i++) {
        
        System.out.println(list.get(i));
    }
   return list;
    }
    
}
