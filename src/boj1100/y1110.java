package boj1100;

import java.util.Scanner;

public class y1110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 0;
        if (n < 10) n *= 10;

        int init_num = n;

        while(true){
            int a = n % 10;
            int b = (n/10 + n%10)%10;

            n = a*10 + b;


            num++;

            if (n == init_num) break;
        }
        System.out.println(num);
    }
}
