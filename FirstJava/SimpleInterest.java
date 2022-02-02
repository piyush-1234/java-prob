package FirstJava;

import java.util.Scanner;

import javax.print.event.PrintEvent;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter principle amount");
        int principle = sc.nextInt();
        System.out.println("enter time duration");
        int time = sc.nextInt();
        System.out.println("enter rate");
        int rate = sc.nextInt();
        simple(principle, time, rate);
        
    }

    private static void simple(int principle, int time, int rate) {

        int sI = principle*(1+rate*time);
        System.out.println(sI);
    }
}
