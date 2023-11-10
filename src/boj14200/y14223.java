package boj14200;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

import static java.lang.Math.abs;

public class y14223 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String t = br.readLine();

        int n = Integer.parseInt(t);
        int[] x = new int[n];
        int[] y = new int[n];
        int[][] x_l = new int[3][n*n];
        int[][] y_l = new int[3][n*n];
        for(int i=0; i<n; i++){
            t = br.readLine();
            StringTokenizer st = new StringTokenizer(t);
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        int m =0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                x_l[m][0] = abs(x[j]-x[i]);
                x_l[m][1] = i;
                x_l[m][2] = j;

                y_l[m][0] = abs(x[j]-x[i]);
                y_l[m][1] = i;
                y_l[m][2] = j;
            }
        }

        Arrays.sort(x_l, Comparator.comparingInt((int[] o) -> o[0]).reversed());
        Arrays.sort(y_l, Comparator.comparingInt((int[] o) -> o[0]).reversed());

        int x1;
        int x2;
        int y1;
        int y2;
        int xp = 0;
        int yp = 0;
        x1 = x_l[0][0];
        y1 = y_l[0][0];
        if(x1>y1) xp++;
        else yp++;

        while(true){
            if(xp >0){

            }
        }
    }
}
