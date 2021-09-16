package boj2700;

import java.io.*;

public class y2742 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int n = Integer.parseInt(s);

        for(int i = n; i >= 1 ; i--){
            String r = Integer.toString(i);
            bw.write(r + "\n");
        }
        bw.flush();
        bw.close();
    }
}
