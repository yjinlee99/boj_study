package boj1000;

import java.util.Scanner;

public class y1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;
        if(n < 100) res = n;
        else if (n < 111) res = 99;
        else{
            res = 99;
            for(int i=111;i<=n;i++) {
                int j = i;
                int a = j % 10;
                j = j / 10;
                int b = j % 10;
                int c = j / 10;

                if ((a - b) == (b - c)) res++;
            }
        }

        System.out.println(res);
    }
}
