package boj14200;

import java.io.*;
import java.util.StringTokenizer;

public class y14223 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String t = br.readLine();

        int n = Integer.parseInt(t);
        int[] x = new int[n];
        int[] y = new int[n];
        int[] f = new int[n];
        for(int i=0; i<n; i++){
            t = br.readLine();
            StringTokenizer st = new StringTokenizer(t);
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                f[n] += Math.sqrt(Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2));
            }
        }


    }
}
