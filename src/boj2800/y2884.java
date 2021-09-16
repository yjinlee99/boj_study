package boj2800;

import java.util.Scanner;

public class y2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        c = b - 45;

        if(c<0){
            a -= 1;
            if (a < 0) a = 23;
            c += 60;
        }

        System.out.println(a+" "+c);
    }
}
