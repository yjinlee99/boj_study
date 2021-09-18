package boj1500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class y1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        StringTokenizer st = new StringTokenizer(s);

        double[] arr = new double[n];
        double max = 0;
        double avg = 0;

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i=0;i<n;i++){
            arr[i] = arr[i] / max * 100;
            avg = avg + arr[i];
        }

        System.out.println(avg/n);
    }
}
