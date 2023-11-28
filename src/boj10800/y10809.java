package boj10800;

import java.util.Scanner;

public class y10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] arr = new int[26];
        for (int i=0; i<26;i++){
            arr[i] = -1;
        }
        for(int i=0; i<s.length(); i++) {
            if(arr[(int)s.charAt(i) - 'a'] == -1) arr[(int)s.charAt(i) - 'a'] = i;
        }
        for(int i=0; i<26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
