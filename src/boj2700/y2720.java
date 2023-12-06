package boj2700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class y2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for(int i=0; i<n; i++) {
            int m = Integer.parseInt(bf.readLine());
            System.out.print(m/25 + " ");
            m = m%25;
            System.out.print(m/10 + " ");
            m = m%10;
            System.out.print(m/5 + " ");
            m = m%5;
            System.out.print(m + "\n");
        }
    }
}
