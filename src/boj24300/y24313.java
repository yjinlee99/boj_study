package boj24300;

import java.util.Scanner;

public class y24313 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();

        if(c-a1 <0 && a0 < 0) System.out.println(0);
        else if(a1*n0 + a0 <= c*n0) System.out.println(1);
        else System.out.println(0);
    }
}
