package boj5000;

import java.util.Scanner;

public class y5086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n == 0 && m == 0) break;

            if(n > m && n%m == 0) System.out.println("multiple");
            else if ( n < m && m%n == 0) System.out.println("factor");
            else System.out.println("neither");
        }
    }
}
