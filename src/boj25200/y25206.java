package boj25200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class y25206 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String s = "";
        double p = 0;
        double i = 0;
        while((s = bf.readLine()) != null && !s.isEmpty()){
            StringTokenizer st = new StringTokenizer(s);
            st.nextToken();
            double h = Float.parseFloat(st.nextToken());
            String d = st.nextToken();
            double j = 0;

            switch (d) {
                case "A+": j=4.5;
                    break;
                case "A0" : j=4.0;
                    break;
                case "B+" : j=3.5;
                    break;
                case "B0" : j=3.0;
                    break;
                case "C+" : j=2.5;
                    break;
                case "C0" : j=2.0;
                    break;
                case "D+" : j=1.5;
                    break;
                case "D0" : j=1.0;
                    break;
                case "F" : j=0.0;
                    break;
                case "P" : continue;
            }

            p = p + (h * j);
            i += h;
        }

        p = p / i;
        System.out.println(p);
    }
}
