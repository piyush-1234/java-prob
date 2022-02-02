package FirstJava;

import java.util.Scanner;

public class armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        orderOfNumber(num);
        armstrongg(num);
    }

    // checking number whether is it armstrong or not
    static void armstrongg(int num)
    {
     int temp1 = num;
     int rem;
     int arm = 0;
     int n = orderOfNumber(num);
     while(temp1!=0)
     {
           rem = temp1%10;
           int mul =1;
           System.out.println(n);
          for(int i=0; i<n; i++)
          {
                 mul = mul * rem;
          }

          arm = arm+mul;
          temp1=temp1/10;
     }
      System.out.println(arm);
    if(arm==num)
    {
       System.out.println("number is armstrong");
    
    }else
    {
        System.out.println("number is not armstrong");
    }
      
    }

    // length of the number
    static int orderOfNumber(int num)
      {
          int temp = num;
          int n=0;
          while(temp!=0)
          {
             n=n+1;
             temp = temp/10;
          }
          System.out.println(n);
          return n;
      }
}
