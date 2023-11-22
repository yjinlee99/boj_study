package boj2900;

import java.util.Scanner;

public class y2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int result = 0;
        for(int i=0; i<s.length(); i++) {
            result ++;
            if(i < s.length()-1) {
                if (s.charAt(i) == 'c') {
                    if (s.charAt(i + 1) == '=' || s.charAt(i + 1) == '-') i++;
                } else if (s.charAt(i) == 'd') {
                    if (s.charAt(i + 1) == 'z') {
                        if(i < s.length
                                ()-2) {
                            if(s.charAt(i+2) == '=') i+=2;
                        }
                    }
                    else if (s.charAt(i + 1) == '-') i++;
                } else if (s.charAt(i) == 'l') {
                    if (s.charAt(i + 1) == 'j') i++;
                } else if (s.charAt(i) == 'n') {
                    if (s.charAt(i + 1) == 'j') i++;
                } else if (s.charAt(i) == 's') {
                    if (s.charAt(i + 1) == '=') i++;
                } else if (s.charAt(i) == 'z') {
                    if (s.charAt(i + 1) == '=') i++;
                }
            }
        }
        System.out.println(result);
    }
}
