package FirstJava;

import java.util.Scanner;

public class InrToUSD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter indian rupees");
        int Inr = sc.nextInt();
        InrToUSDd(Inr);
    }

    static void InrToUSDd(int val)
    {
        int ans = val/73;
        System.out.println(ans);
    }
}
