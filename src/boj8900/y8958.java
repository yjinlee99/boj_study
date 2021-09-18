package boj8900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class y8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0 ; i< n;i++){
            String s = br.readLine();
            String array[] = s.split("");

            int score = 0;
            int all = 0;

            String a = "O";

            for(int j=0;j<array.length;j++){
                if((array[j]).equals(a)){
                    score++;
                    all += score;
                }
                else{
                    score = 0;
                }
            }

            System.out.println(all);
        }
    }
}
