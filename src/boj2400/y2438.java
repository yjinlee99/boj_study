package boj2400;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class y2438 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = sc.nextInt();

        for(int i = 1; i<= n;i++){
            for(int j=0; j<i; j++){
               bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
