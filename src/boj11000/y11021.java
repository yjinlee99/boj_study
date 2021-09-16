package boj11000;

import java.io.*;
import java.util.StringTokenizer;

public class y11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String t = br.readLine();

        int n = Integer.parseInt(t);

        for(int j = 0;j<n;j++) {

            String s = br.readLine();

            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            String num = Integer.toString(j + 1);
            String c = Integer.toString(a + b);

            bw.write("Case #"+num+": " +c + "\n");
        }
        bw.flush();
        bw.close();
    }
}
