package boj25300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class y25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int money = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        if(sum == money) System.out.println("Yes");
        else System.out.println("No");

    }
}
