package boj3000;

import java.util.Scanner;

public class y3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[42];
        int n = 0;

        for(int i=0;i<10;i++){
            int a = sc.nextInt();
            if (arr[a%42]==0){
                n++;
                arr[a%42]++;
            }
        }
        System.out.println(n);
    }
}
