package boj3000;

import java.util.Scanner;

public class y3003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,8};

        for(int i=0; i<6; i++) {
            int a = sc.nextInt();
            System.out.print((arr[i] - a) + " ");
        }

    }
}
