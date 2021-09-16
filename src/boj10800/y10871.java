package boj10800;

import java.io.*;
import java.util.StringTokenizer;

public class y10871 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());

        s = br.readLine();

        int[] arr = new int[n];
        st = new StringTokenizer(s);
        for(int i = 0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] < x) {
                String num = Integer.toString(arr[i]);
                bw.write(num + " ");
            }
        }
        bw.flush();
        bw.close();
    }
}
