package FirstJava;

import java.util.Scanner;

/**
 * CheckingNumber
 */
public class CheckingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        EvenOrOdd(number);
    }

    static boolean EvenOrOdd(int number)
    {
         if(number%2 !=0)
         {
             System.out.println("number is odd");
             return false;
         }
         System.out.println("number is even");
         return true;
    }
}