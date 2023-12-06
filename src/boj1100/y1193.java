package boj1100;

import java.util.Scanner;

public class y1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = 1;
        while(m>n) {
            m -=n;
            n++;
        }
        if(n%2 == 0) {
            System.out.println(m + "/" + (n-(m-1)));
        }
        else {
            System.out.println((n-(m-1)) + "/" + m);
        }
    }
}
