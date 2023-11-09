package boj11000;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class y11663 {

    public static int[] dot;
    int binarySearch1(int key,int low, int high) {
        int mid;

        if(low <= high) {
            mid = (low + high) / 2;

            if(key == arr[mid]) { // 탐색 성공
                return mid;
            } else if(key < arr[mid]) {
                // 왼쪽 부분 arr[0]부터 arr[mid-1]에서의 탐색
                return binarySearch1(key ,low, mid-1);
            } else {
                // 오른쪽 부분 - arr[mid+1]부터 arr[high]에서의 탐색
                return binarySearch1(key, mid+1, high);
            }
        }

        return -1; // 탐색 실패
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String t = br.readLine();

        StringTokenizer st = new StringTokenizer(t);
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        t = br.readLine();
        st = new StringTokenizer(t);



        for(int i=0; i<n; i++){

            dot[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(dot);


        for (int i=0; i<m; i++){
            t = br.readLine();
            st = new StringTokenizer(t);
            int num = 0;
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            if (e < dot[0]) System.out.println(0);
            else if (s > dot[n]) System.out.println(0);
            else {
                int start = 0;
                int end = n;
                if(s > dot[0]) {

                }
            }

            }

            System.out.println(num);
        }


    }
}
