package FirstJava;

import java.util.Scanner;

public class fiboseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fibo(num);
        System.err.println(fibo(num));
    }

    static int fibo(int num)

    {
        if(num<2)
        {
             return num;
        }
          return fibo(num-1)+fibo(num-2);
    }
}
