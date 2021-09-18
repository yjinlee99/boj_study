package boj4673;

public class y4673 {
    public static void main(String[] args) {
        boolean[] arr = new boolean[10000];

        for(int i=1;i<10000;i++){
            int n = i;
            int j = i;
            while(true){
                n = n + j% 10;
                j = j/10;
                if(j<1) break;
            }
            if(n < 10000) arr[n] = true;
        }
        for(int i=1; i<10000; i++){
            if(arr[i] == false){
                System.out.println(i);
            }
        }
    }
}
