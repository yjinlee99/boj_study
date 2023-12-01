package boj1100;

import java.util.Scanner;

public class y1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equals(" ")){
            System.out.println(0);
            return;
        }
        str = str.trim();
        String[] arr = str.split(" ");
        System.out.println(arr.length);
    }
}
