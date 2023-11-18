package boj1100;

import java.util.*;

public class y1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        Integer[] arr = new Integer[26];
        Arrays.fill(arr,0);
        s = s.toUpperCase();
        for(int i=0; i < s.length(); i++) {
            arr[(int)((char)(s.charAt(i)) - 'A')]++;
        }
        int max = 0;
        char c = 0;
        for(int i=0; i<26;i++) {
            if(arr[i] > max) {
                max = arr[i];
                c = (char) ('A' + i);
            }
        }
        for(int i=0; i<26;i++) {
            if (arr[i] == max && c != (char)(i + 'A')) {
                System.out.println('?');
                return;
            }
        }
        System.out.println(c);

    }
}
