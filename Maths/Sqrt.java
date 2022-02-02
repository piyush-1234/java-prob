import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       // int x = sc.nextInt();
       int x = 8;
       mySqrt(x);
               
    }

    static int mySqrt(int x) {
       
      int left = 1;
      int right = x/2;
      while(left <= right)
      {
          int mid = (left+right)/2;
          if(mid > x/mid)
          {
              right = mid - 1;
              continue;
          }else if(mid+1 < x/(mid+1))
          {
             left = mid+1;
             continue;
          }

          return mid;
      }
      return x;
    }
}
