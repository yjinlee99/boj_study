package boj10900;

import java.util.Scanner;

public class y10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        String reverse = sb.reverse().toString();

        if(s.equals(reverse)) System.out.println(1);
        else System.out.println(0);

    }
}
