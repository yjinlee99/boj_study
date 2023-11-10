package boj24300;

import java.util.Scanner;

public class y24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        if(a2 == 0){
            if(c-a1 >= 0) System.out.println(1);
            else System.out.println(0);
        }

        if(c == a1) {
            if(a2 <= 0) System.out.println(1);
            else System.out.println(0);
            return;
        }
        float a = a2 / (c - a1);

        if (n0 >= a) {
            System.out.println(1);
        }
        else System.out.println(0);
    }
}
