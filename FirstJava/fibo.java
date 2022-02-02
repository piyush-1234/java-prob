package FirstJava;

import java.util.Arrays;
import java.util.Scanner;

public class fibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fibo(num);
        System.out.println(fibo(num));
    }

    static String fibo(int num)
    {
        int[] arr = new int[num];
        int i=0;
        while(i<num)
        {
            if(i>1)
            {
               arr[i] = arr[i-1]+arr[i-2];
               i++;
            }else
            {
                arr[i] = i;
                i++; 
            }
        }

        return Arrays.toString(arr);
    }
}
