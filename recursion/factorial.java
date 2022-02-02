import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sol(n));
    }

    static int sol(int n)
    {
        if(n==0 || n==1){return 1;}
        return n*sol(n-1);
    }
}
