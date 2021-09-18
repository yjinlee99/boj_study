package boj10800;

import java.io.*;
import java.util.StringTokenizer;

public class y10818 {
    public static void main(String[] args) throws IOException {

        int max=-1000000, min=1000000;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);

        for(int i=0;i<n;i++){
            int a = Integer.parseInt(st.nextToken());

            if(a > max) max = a;
            if (a < min) min = a;
        }

        System.out.println(min + " " + max);
    }
}
