package boj10800;

import java.util.Scanner;

public class y10813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = i+1;
        }

        for(int i=0; i<m; i++) {
            int temp;
            int a = sc.nextInt();
            int b = sc.nextInt();

            temp = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = temp;
        }

        for(int i=0; i<n; i++) System.out.print(arr[i] + " ");
    }
}
