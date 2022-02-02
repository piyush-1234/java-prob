package FirstJava;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        greeting(name);
    }

    private static void greeting(String name) {
        System.out.println("wellcome to the hacker world"+name);
    }
}
