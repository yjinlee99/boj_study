package boj2500;

import java.util.Scanner;

public class y2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int n = a*b*c;

        String s = Integer.toString(n);

        String[] d = s.split("");

        int arr[] = new int[10];

        for(int i=0;i<s.length();i++){
            int num = Integer.parseInt(d[i]);
            arr[num]++;
        }

        for(int i=0;i<10;i++){
            System.out.println(arr[i]);
        }
    }
}
