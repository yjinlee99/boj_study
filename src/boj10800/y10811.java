package boj10800;

import java.util.Scanner;

public class y10811 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        for(int i=0; i<m; i++) {
            int a =sc.nextInt();
            int b =sc.nextInt();

            for(int j=0; j < (b-a + 1) /2; j++) {
                int temp;
                temp = arr[b-1 -j];
                arr[b-1 -j] = arr[a-1 +j];
                arr[a-1 +j] = temp;
            }
        }

        for(int i=0; i<n; i++) System.out.print(arr[i] + " ");
    }
}
