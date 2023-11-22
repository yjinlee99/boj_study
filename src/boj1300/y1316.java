package boj1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class y1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i=0; i<n; i++) {
            String s = br.readLine();
            result++;
            int[] alp = new int[26];
            alp[s.charAt(0)-'a']++;
            for(int j=1; j<s.length(); j++){
                char c = s.charAt(j);
                if(alp[c-'a'] !=0) {
                    if (s.charAt(j) == s.charAt(j-1)) continue;
                    else {
                        result--;
                        break;
                    }
                }
                else {
                    alp[c-'a'] ++;
                }
            }
        }
        System.out.println(result);
    }
}
