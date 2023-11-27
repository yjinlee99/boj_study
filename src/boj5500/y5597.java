package boj5500;

import java.util.Scanner;

public class y5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] num = new int[30];
        for(int i=0; i<28; i++) {
            num[sc.nextInt() - 1]++;
        }

        for(int i=0; i<30; i++){
            if(num[i] == 0) System.out.println(i+1);
        }

    }
}
