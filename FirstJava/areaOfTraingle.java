package FirstJava;

import java.util.Scanner;

public class areaOfTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float length = sc.nextFloat();
        float height = sc.nextFloat();
        areaofTraing(length, height);

    }

    static float areaofTraing(float length, float height)
    {
        float ans = (float) length*height/2;
        System.out.println(ans);
        return ans;

    }
}
