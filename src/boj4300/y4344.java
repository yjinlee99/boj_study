package boj4300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class y4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i =0; i<n; i++){
            double avg = 0;
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);

            int m = Integer.parseInt(st.nextToken());
            int[] arr = new int[m];

            for(int j=0; j<m; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                avg += arr[j];
            }
            avg = avg/m;
            int num = 0;
            for(int j=0; j<m; j++){
                if(arr[j] > avg) num++;
            }
            System.out.println(String.format("%.3f", (double)num/m*100) + "%");
        }
    }
}
