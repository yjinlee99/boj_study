package boj2500;

import java.io.*;

public class y2562 {
    public static void main(String[] args) throws IOException {

        int max=0;
        int num = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<9;i++){
            int n = Integer.parseInt(br.readLine());

            if (n > max) {
                max = n;
                num = i+1;
            }
        }

        System.out.println(max);
        System.out.println(num);
    }
}

