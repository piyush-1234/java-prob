import java.util.Scanner;

public class fibonacii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonaci(n));
    }

    static int fibonaci(int n)
    {
        if(n < 2)
        {
          return n;
        }
       return fibonaci(n-1) + fibonaci(n-2);
    }
}
